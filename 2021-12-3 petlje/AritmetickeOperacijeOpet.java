package Petlje_2021_12_3;

import java.util.Scanner;

public class AritmetickeOperacijeOpet {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite dva cela broja: ");
        int x = sc.nextInt();
        int y = sc.nextInt();

        int i = 1;
        int rezultat;
        for (i = 1; 1 <= 5; i++) {
            switch (i) {
                case 1:
                    rezultat = x + y;
                    System.out.println(rezultat);
                    break;
                case 2:
                    rezultat = x - y;
                    System.out.println(rezultat);
                    break;
                case 3:
                    rezultat = x * y;
                    System.out.println(rezultat);
                    break;
                case 4:
                    rezultat = x / y;
                    System.out.println(rezultat);
                    break;
                case 5:
                    rezultat = x % y;
                    System.out.println(rezultat);
                   return;

            }


        }
    }
}
