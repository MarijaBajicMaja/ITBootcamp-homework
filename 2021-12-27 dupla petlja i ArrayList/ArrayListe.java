//2. Array liste
//Kreirajte array listu nekog vaseg interesovanje (npr sport)
//-u listu dodajte vase omiljene iteme tog hobija (npr koji su omiljeni sportovi)
//-iz liste dohvatite 3. element liste i ispisite
//-promenite naziv prvog elementa
//-uklonite 5. element
//-ispisite velicinu vase liste
//-pomocu for petlje (i na jedan i na drugi nacin) ispisite sve elemente liste

package DomaciKlase.Ponedeljak;

import java.util.ArrayList;

public class ArrayListe {
    public static void main(String[] args) {
        ArrayList<String> sport = new ArrayList<String>();
        sport.add("plivanje");
        sport.add("klizanje");
        sport.add("ronjenje");
        sport.add("voznja bicikla");
        sport.add("jahanje");
        sport.add("gimnastka");

        System.out.println("Treca stavka na listi je: "+sport.get(2));

        sport.set(0,"tekvondo");
        sport.remove(4);

        System.out.println("Duzina liste je: "+sport.size()+"\n");

        for(int i = 0; i< sport.size(); i++){
            System.out.println(sport.get(i));
        }
        System.out.println();
        
        for(String sportHobi : sport){
            System.out.println(sportHobi);
        }
    }
}
