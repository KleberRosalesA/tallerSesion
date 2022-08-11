package app;

import java.util.Scanner;

public class s32 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int Ed = 0;
        double promedio = 0;
        int contador = 0;
        double suma = 0;

        System.out.println("ingrese una edad: ");
        Ed = input.nextInt();
        suma += solicitar(Ed);
        while (Ed != 0) {
            System.out.println("ingrese una edad: ");
            Ed = input.nextInt();
            suma += solicitar(Ed);
            if (Ed > 18) {
                contador++;
            }
            System.out.println("Digite 0 para finalizar...");
        }
        promedio = suma / contador;
        System.out.println("El promedio es: " + promedio);
    }

    public static double solicitar(int edad) {
        if (edad > 18) {
            return edad;
        } else {
            return 0;
        }
    }
}
