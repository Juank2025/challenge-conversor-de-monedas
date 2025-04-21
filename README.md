<h1 align = "center">Conversor de Monedas</h1>




![Representación de conversión de monedas](https://github.com/user-attachments/assets/965ce748-79da-4917-a19d-4b59325bba8d)



##Índice

*[Descripción del proyecto](#Descripción-del-proyecto).
<p>Esta es una aplicación capaz de convertir monedas a distintas divisas, principalmente USD, BRL , ARS y COP; que son las monedas del Dolar, brasil, argentina y colombia respectivamente</p>

*[Estado del proyecto](#Estado-del-proyecto)
<h4>Concluido</h4>

*[Características de la aplicación y demostración](#Características-de-la-aplicación-y-demostración)

<h3>Características para el usuario</h3>
Primero se muestra el menu principal de la aplicación.

![image](https://github.com/user-attachments/assets/1c2855cc-1a10-468b-b629-c2313f2eeeda)

Aquí puede seleccionar la moneda que desea convertir y a qué divisa.

Una vez elegida una opción, debe ingresar el monto que desea convertir.

![image](https://github.com/user-attachments/assets/078f2991-6978-44e6-af32-4b9b153813bb)

Al presionar la tecla enter, nos dará el resultado de la conversión.

![image](https://github.com/user-attachments/assets/e57ba2f1-4a6f-4749-914a-a3b9950c48d3)

Puede continuar utilizando el programa para hacer conversiones o simplemente puede salir presionando la opción 7

![image](https://github.com/user-attachments/assets/ed878210-af76-4d87-93b9-1f26e792a65e)

<h3>Características para el desarrollador</h3>

Este programa consta de tres clases principales:

La clase Menu

![image](https://github.com/user-attachments/assets/61249907-2c59-49f9-8bad-68a8ee8a5d21)
En esta clase se instancia el menú de nuestro proyecto.

La clase ExchangeRateResponse

![image](https://github.com/user-attachments/assets/e88f038f-120c-4e5c-b5c4-5328d03d3575)
Esta clase es utilizada para mapear la respuesta Json que devuelve la API a un objeto Java utilizando Gson.

La clase ConvertRate
![image](https://github.com/user-attachments/assets/d99f62a7-a23b-46d3-8612-6ed9ab54246b)
Esta clase es la principal, aquí se hace  el cálculo de conversion de monedas, obteniendo la tasa actual a través de la API, con un switch-case.

En esta parte de la clase, se hacen los request hhtp correspondientes, se imprime la tasa actual de la opción ingresada y el cálculo de la tasa por el monto ingresado. Finalmente, se añaden las excepciones por si ocurre algún error.

![image](https://github.com/user-attachments/assets/43f7f3fd-abea-4d2d-82ed-34b27a1406e0)






*[Acceso al proyecto](#acceso-proyecto)

*[Lenguajes y tecnologías utilizadas](#tecnologías-utilizadas)
- Lenguaje de programación: Java
- Entorno de desarrollo: Intellij IDEA
- Dependecia: Gson 2.10.1
- API: ExchangeRate-API

*[Personas-Desarrolladores del Proyecto](#personas-desarrolladores)

<h3>Juan Carlos Palma</h3> 


*[Conclusión](#conclusión)
Está aplicación es muy útil para hacer conversiones de monedas, si eres desarrollador puedes editar el código y añadir divisas de tu preferencia.
