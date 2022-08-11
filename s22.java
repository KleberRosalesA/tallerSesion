package app;

import java.util.*;
import java.io.*;

public class s22 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int nm;
        int cf;
        char cr;
        do {
            System.out.print("Introduce un número entero: ");
            nm = sc.nextInt();
            cf = 0;    
            while (nm != 0) {             
                nm = nm / 10;         
                cf++;          
            }
            System.out.println("El número tiene " + cf + " cifras");
            System.out.print("Continuar? ");
            cr = (char) System.in.read();
        } while (cr != 'n' && cr != 'N');
    }
}
