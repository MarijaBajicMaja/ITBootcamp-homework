// Sve potrebno za glumca i glumicu da budu dva ispisa (edited)

package DomaciKlase.Glumci;

public class TestGlumac {
    public static void main(String[] args) {
         Glumci glumac1 = new Glumci("Goran", "Bogdan", 'm', 41, 10.0, false);
        System.out.println(glumac1);

        Glumci glumac2 = new Glumci("Nada", "Sargin", 'z', 44, 9.2, true);
        System.out.println(glumac2);
    }
}
