//7. Napraviti program koji za unet mesec i dan
// ispisuje odgovarajuci horoskopski znak.

import java.util.Scanner;

public class Zadatak7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Unesite mesec rodjenja: ");
        String mesec = s.nextLine();

        System.out.println("Unesite dan rodjenja: ");
        int dan = s.nextInt();

        System.out.print("Vas horoskopski znak je: ");
        switch (mesec) {
            case "januar":
                if (dan <= 19) {
                    System.out.println("jarac.");
                } else {
                    System.out.println("vodolija.");
                }
                break;
            case "februar":
                if (dan <= 19) {
                    System.out.println("vodolija.");
                } else {
                    System.out.println("ribe.");
                }
                break;
            case "mart":
                if (dan <= 20) {
                    System.out.println("ribe.");
                } else {
                    System.out.println("ovan.");
                }
                break;
            case "april":
                if (dan <= 20) {
                    System.out.println("ovan.");
                } else {
                    System.out.println("bik.");
                }
                break;
            case "maj":
                if (dan <= 20) {
                    System.out.println("bik.");
                } else {
                    System.out.println("blizanci.");
                }
                break;
            case "jun":
                if (dan <= 20) {
                    System.out.println("blizanci.");
                } else {
                    System.out.println("rak.");
                }
                break;
            case "jul":
                if (dan <= 22) {
                    System.out.println("rak.");
                } else {
                    System.out.println("lav.");
                }
                break;
            case "avgust":
                if (dan <= 22) {
                    System.out.println("lav.");
                } else {
                    System.out.println("devica.");
                }
                break;
            case "septembar":
                if (dan <= 22) {
                    System.out.println("devica.");
                } else {
                    System.out.println("vaga.");
                }
                break;
            case "oktobar":
                if (dan <= 22) {
                    System.out.println("vaga.");
                } else {
                    System.out.println("skorpija.");
                }
                break;
            case "novembar":
                if (dan <= 22) {
                    System.out.println("skorpija.");
                } else {
                    System.out.println("strelac.");
                }
                break;
            case "decembar":
                if (dan <= 21) {
                    System.out.println("strelac.");
                } else {
                    System.out.println("jarac.");
                }
                break;
            default:
                System.out.println("Nije dobar unos, pokusajte ponovo.");
                break;

        }
    }
}
