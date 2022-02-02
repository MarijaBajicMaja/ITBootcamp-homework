package DomaciKlase.Automobil;

import DomaciKlase.Automobil.Automobil;
import Klase.Osoba;

public class VoznjaOpet {
    public static void main(String[] args) {

        Osoba vlasnik = new Osoba("Milan", "Peric", 1977, 182.1);

        Automobil auto1 = new Automobil("Peugeot", "308", 68970, vlasnik);
        Automobil auto2 = new Automobil("Peugeot", "207",5869);
        System.out.println(auto1);
        System.out.println(auto2);

        Osoba vlasnikNov = new Osoba("Marko", "Markovic", 1984, 179.4);
        auto2.setVlasnik(vlasnikNov);
        System.out.println(auto2);
    }
}
