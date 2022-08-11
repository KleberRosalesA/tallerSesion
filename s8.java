package app;

import java.util.Scanner;

class s8 {

    public static void main(String[] args) {
        Scanner escaner = new Scanner(System.in);
  
        System.out.println("Digite un número:");
      
        double numero = escaner.nextDouble();
     
        if (numero < 0) {
            System.out.println("Su numero es negativo");
        } else {
            System.out.println("Su número es positivo");
        }

    }
}
