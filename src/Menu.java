import java.util.Scanner;

public class Menu {
    public static int mostrarMenu(Scanner scanner) {
        System.out.println("**********************************************************");
        System.out.println("Sea bienvenido/a al Conversor de Monedas =]");
        System.out.println("\n\n1) Dólar =>> Peso argentino");
        System.out.println("2) Peso argentino =>> Dólar");
        System.out.println("3) Dólar =>> Real brasileño");
        System.out.println("4) Real brasileño =>> Dólar");
        System.out.println("5) Dólar =>> Peso colombiano");
        System.out.println("6) Peso colombiano =>> Dólar");
        System.out.println("7) Salir");
        System.out.print("Elija una opción válida: ");
        System.out.println("\n**********************************************************");
        return scanner.nextInt();
    }

}
