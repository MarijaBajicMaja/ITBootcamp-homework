package DomaciUtorak;

import java.util.Scanner;

public class ZadatakTriNulaB {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite duzinu niza x: ");
        int[] x = new int[s.nextInt()];

        System.out.println("Unesite elemente niza x: ");
        for(int i = 0; i< x.length; i++){
            x[i] = s.nextInt();
        }
        System.out.println(proizvod(x));
    }
    public static int proizvod(int y[]){
        int p = 1;
        for(int j = 0; j< y.length;j++){
            p = p * y[j];
        }
        return p;
    }
}
