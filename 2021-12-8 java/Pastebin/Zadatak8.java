//8. Korisnik unosi ime, prezime i godinu rodjena. Ispisati:
//	"Dobrodosao u {x}. razred, {ime} {prezime}",
//	pod pretpostavkom da je trenutna godina 2021. Pretpostavimo da ima 12 razreda.
//	A ako korisnik nije djak ispisati jednu odgovarajucu
//    poruku od:
//	"{ime} {prezime} je zavrsio skolu" ili "{ime} {prezime} tek treba da zapocne obrazovanje"

import java.util.Scanner;

public class Zadatak8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Unesite Vase ime, prezime i godinu rodjenja:");
        String ime = s.nextLine();
        String prez = s.nextLine();
        int rodj = s.nextInt();


        if ((2021 - rodj) < 7) {
            System.out.println(ime + " " + prez + " tek treba da zapocne obrazovanje.");
        } else if ((2021 - rodj) > (6 + 12)) {
            System.out.println(ime + " " + prez + " je zavrsio/zavrsila skolu.");
        } else {
           int x = 2021 - rodj - 6;
            System.out.println("Dobrodosao/dobrodosla u " + x + ". razred, " + ime + " " + prez + ".");
        }
    }
        }

