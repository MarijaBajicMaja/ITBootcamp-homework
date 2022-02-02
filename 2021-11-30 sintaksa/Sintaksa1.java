//Sintaksa1: Napisati program koji ce racunati povrsinu okrecene prostorije, tako sto se ivice prostorije ucitavaju preko konzole.
// za pretpostavku uzeti da prostorija ima zidove oblika pravougaonika i da nema prozora i vrata).

import java.util.Scanner;

public class Sintaksa1 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Unesite visinu prostorije (u metrima, sa tackom umesto zareza):");
        float b = scanner.nextFloat();

        System.out.print("Unesite duzinu veceg zida (u metrima, sa tackom umesto zareza):");
        float a = scanner.nextFloat();

        System.out.print("Unesite duzinu manjeg zida (u metrima, sa tackom umesto zareza):");
        float c = scanner.nextFloat();

        float p = (a * b) * 2 + (c * b) * 2 + (a * c);
        System.out.println("Povrsina okrecene prostorije je:" + p + "m2");
    }






}
