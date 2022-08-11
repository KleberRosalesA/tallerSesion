package app;

import java.util.Scanner;

public class s21{

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double MC;
        double Dsc = 0.020;
        double Tp;

        System.out.print("Ingrese el monto de su compra : ");
        MC = in.nextDouble();
        in.nextLine();

        Dsc = MC * 0.020;
        Tp= MC-Dsc;
        
        if (MC <= 999) {
            System.out.println("No existe Descuento");
            System.out.println("Su total a pagar es de: "+MC+"$");
        } else if (MC >= 1000) {
            System.out.println("Su descuento del 20% es de: "+Dsc +"$");
             System.out.println("El total a pagar es de: "+Tp);
        }
    }
}

