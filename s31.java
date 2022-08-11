package app;

import java.util.Scanner;

public class s31 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int Nm = 0;
        double sm = 0;
        double pr = 0;
        int contador = 0;

        System.out.println("Registre un numero: ");
        Nm = input.nextInt();

        sm += Nm;

        while (Nm != 0) {
            System.out.println("Registre un numero: ");
            Nm = input.nextInt();
            sm += Nm;
            contador++;
        }
        pr = sm / contador;
        System.out.println("El promedio es: " + pr);
    }
}
