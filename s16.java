
package app;

import javax.swing.JOptionPane;

public class s16{

    public static void main(String[] args) {
        double M = 0.0;
        double o = 0.0;
        double p = 0.0;
        double q = 0.0;

        o = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la variable de A:"));
        p = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la variable de B:"));
        q = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la variable de C:"));

        M = (-p + (Math.sqrt(Math.pow(p, 2) + (4 * o * q)))) / (2 * o);

        JOptionPane.showMessageDialog(null, M);
        int numero1 = 0;
        int numero2 = 0;
        int numero3 = 0;

        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero:"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero:"));
        numero3 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tercer numero:"));
        if (numero1 > numero2 && numero1 > numero3) {
            System.out.println("El primer numero: " + numero1 + " es el mayor");
            if (numero2 > numero3) {
                System.out.println("El segundo numero: " + numero2 + " es el segundo mayor");
                System.out.println("El tercer numero: " + numero3 + " es el menor");
            } else {
                System.out.println("El tercer numero: " + numero3 + " es el segundo mayor");
                System.out.println("El segundo numero: " + numero2 + " es el menor");
            }
        } else if (numero2 > numero1 && numero2 > numero3) {
            System.out.println("El segundo numero: " + numero1 + " es el mayor");
            if (numero1 > numero3) {
                System.out.println("El primer numero: " + numero1 + " es el segundo mayor");
                System.out.println("El tercer numero: " + numero3 + " es el menor");
            } else {
                System.out.println("El tercer numero: " + numero3 + " es el segundo mayor");
                System.out.println("El primer numero: " + numero1 + " es el menor");
            }
        } else if (numero3 > numero1 && numero3 > numero2) {
            System.out.println("El tercer numero: " + numero3 + " es el mayor");
            if (numero1 > numero2) {
                System.out.println("El primer numero: " + numero1 + " es el segundo mayor");
                System.out.println("El segundo numero: " + numero2 + " es el menor");
            } else {
                System.out.println("El segundo numero: " + numero2 + " es el segundo mayor");
                System.out.println("El primer numero: " + numero1 + " es el menor");
            }
        }
    }
}
