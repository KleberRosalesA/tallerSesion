package app;

import javax.swing.JOptionPane;

public class s24 {

    public static void main(String[] args) {
        //NUMEROS PRIMOS Y NO PRIMOS 
        //ENTRADA
        int n = 7;
        int atc = 0;
        int ctdvs = 0;
        //PROCESO
        //JOptionPane.showMessageDialog(null, "Ingrese un numero");
        atc = n - 1;
        while (atc > 1) {
            if (n % atc == 0) {
                ctdvs++;

            }
            atc--;

        }
        //VALIDAR SI ES PRIMO
        if (ctdvs == 0) {
            JOptionPane.showMessageDialog(null, "Es primo");

        } else {
            JOptionPane.showMessageDialog(null, "No es primo");
        }
    }

}
