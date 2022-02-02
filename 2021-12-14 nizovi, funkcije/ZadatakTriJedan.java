// Napisati funkciju koja racuna proizvod 3 broja.
//Hint kako citati ove zadatke:
//- ... racuna proizvod 3 broja = proseldjuje joj se 3 broja (imace 3 argumenta)
//- funkciju koja racuna = vraca odgovarajuci podatak (nece biti void nego nesto konkretno)

package DomaciUtorak;

import java.util.Scanner;

public class ZadatakTriJedan {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite neka tri broja: ");
        int x = s.nextInt();
        int y = s. nextInt();
        int z = s.nextInt();
        System.out.println("Proizvod unetih brojeva je "+proizvod3(x,y,z));
    }
    public static int proizvod3(int a, int b , int c){
        int p = a * b * c;
        return p;
    }
}
