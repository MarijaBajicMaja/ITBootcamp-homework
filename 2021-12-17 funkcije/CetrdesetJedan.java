//41. Napisati funkciju koja racuna prosecnu vrednost double[] niza.

package Pstebin;

import java.util.Scanner;

public class CetrdesetJedan {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        double[]x = new double[n];
        for(int i = 0; i< x.length; i++){
            x[i] = s.nextDouble();
        }

        double vracen = prosecnaVrednost(x);
    }

    public static double prosecnaVrednost(double[]y){
        double sum = 0.0;
        for(int i = 0; i<y.length; i++){
            sum += y[i];
        }
        double prosecnaVrednost = sum/y.length;
        return prosecnaVrednost;
    }
}
