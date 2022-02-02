package Petlje_2021_12_3;

import java.util.Scanner;

public class FizzBuzz {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite ceo, pozitivan broj: ");
        int n = sc.nextInt();
        int i;
        for (i = 1; i <= n; i++) {

            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i +": FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println(i+ ": Fizz");
            } else if (i % 5 == 0) {
                System.out.println(i+ ": Buzz");}
                else{
                    System.out.println(i +"");}
            }
        }
    }

