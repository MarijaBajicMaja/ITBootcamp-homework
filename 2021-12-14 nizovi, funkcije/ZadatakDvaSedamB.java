package DomaciUtorak;

import java.util.Scanner;

public class ZadatakDvaSedamB {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite duzinu niza: ");
        int[] x = new int[s.nextInt()];

        System.out.println("Unesite elemente niza: ");
        for (int i = 0; i< x.length; i++){
            x[i] = s.nextInt();
        }
        svakiDrugi(x);

    }
    public static void svakiDrugi(int [] y){
        for(int j = 0; j<y.length; j++){
            if( j%2 == 0){
                System.out.println(y[j]);
            }
        }
    }
}
