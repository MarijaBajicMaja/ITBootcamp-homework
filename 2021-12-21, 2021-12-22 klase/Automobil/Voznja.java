package DomaciKlase.Automobil;

import DomaciKlase.Automobil.Automobil;
import Klase.Osoba;

import java.util.Scanner;

public class Voznja {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Unesite marku automobila: ");
        String marka = s.nextLine();

        System.out.println("Unesite model automobila: ");
        String model = s.nextLine();

        System.out.println("Unesite serijski broj automobila: ");
        int serijskiBroj = s.nextInt();
        s.nextLine();

        System.out.println("Da li vozilo ima vlasnika?");
        Osoba vlasnik = null;
        String odgovor = s.next();
        if(odgovor.equals("da")) {
            System.out.println("Unesite ime, prezime Vlasnika, njegovu godinu rodjenja i visinu: ");
            vlasnik = new Osoba(s.next(), s.next(), s.nextInt(), s.nextDouble());
        }

        Automobil a1 = new Automobil(marka, model, serijskiBroj, vlasnik);
        System.out.println(a1);
    }
}
