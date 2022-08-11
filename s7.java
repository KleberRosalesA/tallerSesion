package app;

import java.util.Scanner;

public class s7 {

    public static void main(String[] args) {
        int numero;
        Scanner teclado = new Scanner(System.in);

        System.out.printf("Registre un número entero: ");
        numero = teclado.nextInt();

        if (numero % 2 == 0) {
            System.out.printf("El numero es par");
        } else {
            System.out.printf("El numero es impar");
        }
    }
}
