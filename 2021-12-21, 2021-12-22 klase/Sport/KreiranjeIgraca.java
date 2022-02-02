//Napisati glavni program koji kreira tri igraca. U glavnom programu iskoristiti (proizvoljan broj puta)
// sve tipove metoda napisanih u klasi Sportista.

package DomaciKlase.Sport;

public class KreiranjeIgraca {
    public static void main(String[] args) {
         Sportista igrac1 = new Sportista("Ivan Petrovic", "kosarka", "Zvezda", 6);
        System.out.println(igrac1.getImeIPrezime()+"\n"+ igrac1.getSportKojimSeBavi()+"\n"+ igrac1.getKlub()+"\n"+igrac1.getBrojNaDresu());

Sportista igrac2 = new Sportista("Petar Petrovic", "kosarka", "Partizan", 3);
        System.out.println(igrac2.getImeIPrezime()+"\n"+ igrac2.getSportKojimSeBavi()+"\n"+ igrac2.getKlub()+"\n"+igrac2.getBrojNaDresu());

        Sportista igrac3 = new Sportista("Stefan Stefanovic", "fudbal","Radnicki", 2);
        System.out.println(igrac3.getImeIPrezime()+"\n"+ igrac3.getSportKojimSeBavi()+"\n"+ igrac3.getKlub()+"\n"+igrac3.getBrojNaDresu());

        igrac2.setKlub("Zvezda");
        System.out.println(igrac2.getImeIPrezime()+"\n"+ igrac2.getSportKojimSeBavi()+"\n"+ igrac2.getKlub()+"\n"+igrac2.getBrojNaDresu());

        igrac3.setKlub("Partizan");
        igrac3.setBrojNaDresu(5);
        System.out.println(igrac3.getImeIPrezime()+"\n"+ igrac3.getSportKojimSeBavi()+"\n"+ igrac3.getKlub()+"\n"+igrac3.getBrojNaDresu());

    }
    }
