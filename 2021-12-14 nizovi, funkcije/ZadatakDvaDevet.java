// -//-. Ispisati svaki treci element u obrnutom redosledu.
//Primer: [1, 2, 3, 4, 5, 6, 7, 8] -> 8 5 2

package DomaciUtorak;

import java.util.Scanner;

public class ZadatakDvaDevet {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite duzinu niza: ");
        int[] x = new int[s.nextInt()];

        System.out.println("Unesite elemente niza: ");
        for(int i = 0; i< x.length; i++){
            x[i] = s.nextInt();
        }
        for(int i = x.length - 1; i>=0 ; i = i-3){
            System.out.println(x[i]);
        }
    }
}
