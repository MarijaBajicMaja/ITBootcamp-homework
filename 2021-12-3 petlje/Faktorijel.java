package Petlje_2021_12_3;

import java.util.Scanner;

public class Faktorijel {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite ceo, pozitivan broj: ");
        int n = sc.nextInt();
        int i;
        int f = n;

        for(i = 1; i < n; i++){
            f = f * (n-i);
        }
        System.out.println(f);

    }
}
