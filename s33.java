package app;

import java.util.Scanner;

public class s33 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int Ex = 0;
        int B = 0;

        System.out.println("ingrese la base: ");
        B = input.nextInt();
        System.out.println("ingrese el exponente: ");
        Ex = input.nextInt();

        System.out.println("El resultado es: " + elevar(B, Ex));

    }

    public static double elevar(int base, int exponente) {
        return Math.pow(base, exponente);
    }
}
