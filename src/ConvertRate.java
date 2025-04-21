import com.google.gson.Gson;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ConvertRate extends ExchangeRateResponse {
    private static final String API_KEY = "03533d985dd0df445e7bacb6"; // <-- poné tu API key aquí

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 7) {
            try {
                opcion = Menu.mostrarMenu(scanner);

                if (opcion == 7) {
                    System.out.println("¡Gracias por usar el conversor! Saliendo del programa.");
                    break;
                }

                System.out.print("Ingrese el valor que desea convertir: ");
                double cantidad = scanner.nextDouble();

                String from = "";
                String to = "";

                switch (opcion) {
                    case 1 -> { from = "USD"; to = "ARS"; }
                    case 2 -> { from = "ARS"; to = "USD"; }
                    case 3 -> { from = "USD"; to = "BRL"; }
                    case 4 -> { from = "BRL"; to = "USD"; }
                    case 5 -> { from = "USD"; to = "COP"; }
                    case 6 -> { from = "COP"; to = "USD"; }
                    default -> {
                        System.out.println("Opción inválida. Intente nuevamente.");
                        continue;
                    }
                }

                String url = String.format("https://v6.exchangerate-api.com/v6/%s/latest/%s", API_KEY, from);

                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(url))
                        .build();

                HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

                Gson gson = new Gson();
                ExchangeRateResponse data = gson.fromJson(response.body(), ExchangeRateResponse.class);

                if (data != null && data.conversion_rates.containsKey(to)) {
                    double tasa = data.conversion_rates.get(to);
                    double resultado = cantidad * tasa;

                    System.out.printf("Tasa actual %s → %s: %.4f%n", from, to, tasa);
                    System.out.printf("El valor: %.2f [%s] corresponde al valor final de =>>> %.2f [%s%n]", cantidad, from, resultado, to);
                } else {
                    System.out.println("No se encontró la tasa de cambio para la conversión.");
                }

            } catch (InputMismatchException e) {
                System.out.println("Entrada no válida. Por favor, ingrese un número.");
                scanner.nextLine(); // Limpiar buffer
            } catch (IOException | InterruptedException e) {
                System.out.println("Error al conectarse con la API: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Ocurrió un error inesperado: " + e.getMessage());
            }
        }

        scanner.close();
    }
}