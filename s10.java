package app;

import java.util.Scanner;

public class s10 {

    public static void main(String[] args) {
        long num;
        long ax;
        long dig;
        long ent;
        int ex;
        boolean esBinario;

        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Ingrese un numero binario: ");
            num = sc.nextLong();

            esBinario = true;
            ax = num;
            while (ax != 0) {
                dig = ax % 10;
                if (dig != 0 && dig != 1) {
                    esBinario = false;
                }
                ax = ax / 10;
            }
        } while (!esBinario);

        ex = 0;
        ent = 0;
        while (num != 0) {

            dig = num % 10;

            ent = ent + dig * (int) Math.pow(2, ex);

            ex++;

            num = num / 10;
        }
        System.out.println("Entero: " + ent);
    }
}
