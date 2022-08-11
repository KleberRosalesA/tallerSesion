package app;

import java.util.Scanner;

public class s12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int D;
        int M;
        int A;
         System.out.println("Registra dia:");
          D = sc.nextInt();
          System.out.println("Registra mes: ");
           M = sc.nextInt();
        System.out.println("Registra año: ");
        A = sc.nextInt();
        if (A % 4 == 0 && A % 100 != 0 || A % 400 == 0) {
            System.out.println("El año " + A + " Si es bisiesto ");
        } else {
            System.out.println("El año " + A + " No es bisiesto ");
        }
    }
}
