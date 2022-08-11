package app;

import java.util.Scanner;

public class s6 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Ingresar el valor del cateto A: ");
        double C = input.nextDouble();
        System.out.print("Ingresar el valor del cateto B: ");
        double D = input.nextDouble();

        C = Math.pow(C, 2);
        D = Math.pow(D, 2);

        double c = Math.sqrt(C + D);

        System.out.println("Valor de Hipotenusa es: " + c);
    }
}
