package app;

import javax.swing.*;

public class s23 {

    public static void main(String[] args) {
        int n;
        int inv;
        int auxl;
        int digito;
        n = Integer.parseInt(JOptionPane.showInputDialog("Reistre un numero: "));
        inv = 0;
        auxl = n;
        while (auxl > 0) {
            digito = auxl % 10;
            inv = inv * 10 + digito;
            auxl = auxl / 10;
        }
        if (n == inv) {
            JOptionPane.showMessageDialog(null, "El numero es capicuo");
        } else {
            JOptionPane.showMessageDialog(null, "El numero no es capicuo");
        }
    }
}
