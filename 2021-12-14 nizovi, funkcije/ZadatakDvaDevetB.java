package DomaciUtorak;

import java.util.Scanner;

public class ZadatakDvaDevetB {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite duzinu niza: ");
        int[] x = new int[s.nextInt()];

        System.out.println("Unesite elemente niza: ");
        for(int i = 0; i < x.length; i++){
            x[i] = s.nextInt();
        }
        obrnuti(x);
    }
    public static void obrnuti(int[] y){
        for(int j = y.length-1; j>=0; j=j-3){
            System.out.println(y[j]);
        }
    }
}
