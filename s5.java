package app;

import javax.swing.JOptionPane;

public class s5 {

    public static void main(String[] args) {
        double M = 0.0;
        double K = 0.0;
        double S = 0.0;
        double c = 0.0;
        
        K = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la variable de A:"));
        S = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la variable de B:"));
        c = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la variable de C:"));
        
        M = (-S +(Math.sqrt(Math.pow(S, 2) + (4*K*c))))/(2*K);
        
        JOptionPane.showMessageDialog(null, M);
    }
}
