package app;

import java.util.Scanner;

public class s26 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int Nm = 0;
        String palabra = "";
        System.out.println("ingrese la contraseña");
        palabra = input.nextLine();
        Nm = palabra.length();
            while (Nm!=10) {
                System.out.println("Cantidad de digitos tienen que ser 10, vuelva a ingresarla");
                System.out.println("ingrese la contraseña");
                palabra = input.nextLine();
                Nm = palabra.length();
            }
             System.out.println("La contraseña es valida");
        }
    }
