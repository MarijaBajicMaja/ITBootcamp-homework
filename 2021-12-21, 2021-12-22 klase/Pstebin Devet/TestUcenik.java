package DomaciKlase.PstebinDevet;

import java.util.ArrayList;
import java.util.Arrays;

public class TestUcenik {
    public static void main(String[] args) {

        Ucenik u1 = new Ucenik("Masa", "Peric", new ArrayList<Integer>(Arrays.asList(5,4,5,3)));
        Ucenik u2 = new Ucenik("Tasa", "Cuk", new ArrayList<Integer>(Arrays.asList(2,4,3,3)));
        Ucenik u3 = new Ucenik("Dasa", "Milovanovic", new ArrayList<Integer>(Arrays.asList(5,4,5,5)));
        Ucenik u4 = new Ucenik("Sasa", "Denic", new ArrayList<Integer>(Arrays.asList(3,5,5,5)));

        System.out.println(u1.getIme()+" "+u1.getPrezime()+"\n"+u1.getOcene());
        System.out.println(u1.prosek(u1.getOcene()));
        System.out.println(u2.getIme()+" "+u2.getPrezime()+"\n"+u2.getOcene());
        System.out.println(u2.prosek(u2.getOcene()));
        System.out.println(u3.getIme()+" "+u3.getPrezime()+"\n"+u3.getOcene());
        System.out.println(u3.prosek(u3.getOcene()));
        System.out.println(u4.getIme()+" "+u4.getPrezime()+"\n"+u4.getOcene());
        System.out.println(u4.prosek(u4.getOcene()));

    }

}
