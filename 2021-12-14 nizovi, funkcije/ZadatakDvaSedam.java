package DomaciUtorak;

import java.util.Scanner;

public class ZadatakDvaSedam {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite duzinu niza: ");
        int n = s.nextInt();
        int[] x = new int [n];

        System.out.println("Unesite elemente niza: ");
        for( int i = 0; 1<n; i++){

            x[i] = s.nextInt();
            if(i % 2 == 0){
                System.out.println(x[i]);
            }
        }
    }
}
