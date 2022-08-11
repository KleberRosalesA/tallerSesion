package app;

import java.util.Scanner;

public class s28 {

    public static void main(String[] args) {

  Scanner input = new Scanner(System.in);

        int contarEdad1 = 0, contarEdad2 = 0;
        double ed = 0;
        double ps = 0;
        double et = 0;
        double promEdad = 0;
        double promEstatura = 0;
        double promPeso = 0;
        double promPesoEdad = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println("Persona: " + i);
            System.out.println("Ingresa la edad: ");
            ed = input.nextDouble();
            System.out.println("Ingresa el peso: ");
            ps = input.nextDouble();
            System.out.println("Ingresa la estatura: ");
            et = input.nextDouble();
            promEdad += ed;
            promPeso += ps;
            promEstatura += et;
            if (ed >= 18 && ed <= 25) {
                contarEdad1++;
                promPesoEdad += ps;
            } else if (ed > 36) {
                contarEdad2++;
            }
        }
        promEdad = promEdad / 10;
        promEstatura = promEstatura / 10;
        promPeso = promPeso / 10;
        promPesoEdad = promPesoEdad / contarEdad1;
        System.out.println("Promedio de las edades: " + promEdad);
        System.out.println("Promedio de las estaturas: " + promEstatura);
        System.out.println("Promedio de los pesos: " + promPeso);
        System.out.println("Personas entre 18 y 25 anios: " + contarEdad1);
        System.out.println("Personas mayores de 36: " + contarEdad2);
        System.out.println("Promedio del peso de personas entre 18 y 25 anios: " + promPesoEdad);
        
    }
}
