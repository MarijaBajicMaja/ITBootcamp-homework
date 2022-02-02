//Grananja1: Napisati program koji proverava da li je uneti broj paran.
// Ukoliko jeste, program treba da ispise poruku: Broj je paran!
// Ukoliko nije, program treba da ispise poruku: Broj je neparan!

import java.util.Scanner;

public class Grananja1 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Unesite ceo broj:");
        int broj = scanner.nextInt();

        if (broj % 2 == 0 && broj != 0) {
            System.out.println("Broj je paran!");
        } else if (broj != 0) {
            System.out.println("Broj je neparan!");
        } else {
            return;
        }
    }
}