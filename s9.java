package app;

import java.util.Scanner;

class s9{

    public static boolean findParity(int x) {

        x = (x & 0x0000FFFF) ^ (x >> 16);
        x = (x & 0x000000FF) ^ (x >> 8);
        x = (x & 0x0000000F) ^ (x >> 4);
        x = (x & 0x00000003) ^ (x >> 2);
        x = (x & 0x00000001) ^ (x >> 1);

        return (x & 1) == 1;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int A = 0;
        System.out.println("Registre un numero: ");
        A = sc.nextInt();
        System.out.println(A + "  en binarios es " + Integer.toBinaryString(A));

        if (findParity(A)) {
            System.out.println(A + " contiene bits impres");
        } else {
            System.out.println(A + " contiene bits paraes");
        }
    }
}
