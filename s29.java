package app;

import java.util.Scanner;

public class s29 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int nm = 0;
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 12; j++) {
                nm = i * j;
                System.out.println(i + "*" + j + "=" + nm);
            }
        }
    }
}
