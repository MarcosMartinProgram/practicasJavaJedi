package iniciadojavajedi;

public class iniciadoJavaJedi {
    public static void main(String[] args) {
        //Ejercicios 1 
        //Suma de dos números: Se le solicita que guarden dos números enteros y los sumen. El resultado mostrarlo por pantalla.
        int num1 = 5;
        int num2 = 46;
        int suma = num1 + num2; 

        System.out.println("Ejercicio 1");

        System.out.println(suma);

        /*Ejercicio 2
        
         * Suma de dos números bis: Se les solicita que guarden dos números enteros y los
         sumen. 
         * El resultado guardarlo, mostrarlo por pantalla junto con un mensaje que indique si se trata de un número par o impar.
         * El mensaje debe tener el siguiente formato:
         “El resultado es “ {Resultado} “y es” {paridad}
         */

        int nume1 = 6;
        int nume2 = 46;
        int suma2 = nume1 + nume2; 

        String paridad = suma2 % 2 == 0 ? "par" : "impar";

        System.out.println("Ejercicio 2");

        System.out.println("El resultado es " + suma2 + " y es " + paridad);
        

        /*Ejercio 3
         *Caracteres : Guarde en distintos espacios de memoria los caracteres de su nombre
         y luego imprimirlos por pantalla. ¿Por qué no puede usar "" en el char?

         Porque las comillas dobles "" se utilizan para representar cadenas de caracteres (tipo String) en Java. 
         Las comillas simples ' ' se utilizan para representar un único carácter (tipo char). 
         Al utilizar comillas dobles en lugar de comillas simples, el compilador de Java interpretará la entrada 
         como una cadena de caracteres en lugar de un carácter individual.
         */

        char let1 = 'M';
        char let2 = 'a';
        char let3 = 'r';
        char let4 = 'c';
        char let5 = 'o';
        char let6 = 's';

        System.out.println("Ejercicio 3");
        
        System.out.println("" + let1 + let2 + let3 + let4 + let5 + let6);

        /*Ejercicio 4
         * Cálculo de divisibilidad: Se le solicita que guarden dos números enteros y los
            sumen, determine si el primer número es divisible por el segundo número y muestre
            el resultado.
         */

        int nu1 = 30;
        int nu2 = 5; 

        int suma3 = nu1 + nu2; 

        String divisivilidad = nu1 % nu2 == 0 ? " Es divisible" : " No es divisible";

        System.out.println("Ejercicio 4");

        System.out.println("El numero, " + nu1 + divisivilidad + " por " + nu2);

        /*Ejercicio 5
         * Triangulo de asteriscos : Se le solicita que creen un programa que imprima un
            triángulo de asteriscos en la consola.
         */
        System.out.println("Ejercicio 5");

        int alturaTriangulo = 6;
        for (int i = 1; i <= alturaTriangulo; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

        System.out.println();
        }

        /*Ejercio 6
         * Nombre de bebida: Se le solicita que guarde en espacios de memoria distinta la
            información de: El nombre de su última mascota y nombre de la última película
            vista. Por último mostrarlo por pantalla con el siguiente formato:
            “Nombre de la próxima bebida : ” {Nombre de mascota} {Nombre de pelicula}
         */

        String mascota = " Roco";
        String ultimaPelicula = " Avatar 3";

        System.out.println("Ejercicio 6");

        System.out.println("Nombre de la proxima bebida : " + mascota + ultimaPelicula);

        /*Ejercicio 7
         * Multiplicación: Se le solicita que guarde dos números reales y los multiplique, luego
            guarde otros dos números enteros y multiplicarlos. Guarde en un espacio de
            memoria la suma entre estas dos multiplicaciones ¿Que resultado le da? ¿Entero o
            real? ¿Por qué?
         */

         double numReal1 = 3.5;
         double numReal2 = 8.45;
         int numEntero1 = 9;
         int numEntero2 = 5;

         double multiReal = numReal1 * numReal2;
         int multiEntero = numEntero1 * numEntero2;

         double sumaRE = multiReal + multiEntero; 

         System.out.println("Ejercicio 7");
         
         System.out.println("El resultado de la suma de las dos multiplicaciones es " + sumaRE + " y es un Real ");
         System.out.println("Al sumar un número entero con un número real, el resultado siempre será un número real. Esto se debe a que los números reales pueden representar números decimales o fraccionarios, mientras que los números enteros solo pueden representar números enteros");



    }
}
