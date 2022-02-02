// -//-. Izracunati proizvod elemenata tog niza.
//Primer: [2, 4] -> 8
package DomaciUtorak;

import java.util.Scanner;

public class ZadatakTriNula {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite duzinu niza: ");
        int[] x = new int[s.nextInt()];
        int p = 1;

        System.out.println("Unesite elemente niza: ");
        for(int i = 0; i< x.length; i++){
            x[i] = s.nextInt();
            p = p * x[i];
        }
        System.out.println("Proizvod elemenata niza je "+p+".");
    }
}
