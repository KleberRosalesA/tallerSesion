package app;

import java.util.Scanner;

public class s34 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int L = 0;

        System.out.println("ingrese la medida de un lado del petagono: ");
        L = input.nextInt();

        System.out.println("El perimetro del pentagono es: " + calcular(L));

    }

    public static int calcular(int lado) {
        return lado * 5;

    }
}
