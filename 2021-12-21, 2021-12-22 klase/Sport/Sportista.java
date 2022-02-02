//sport - Napisati klasu Sportista. Sportista ima
//1) ime i prezime (polje tipa String) koje moze da se dohvati, ali ne i postavi
//2) sport kojim se bavi (polje tipa String) koje moze da se dohvati ali ne i postavi
//3) klub za koji igra (polje tipa String) koje moze da se dohvati. Sportista moze da
// promeni klub za koji igra.
//4) broj koji nosi na dresu ( tipa int) koje moze i da se dohvati i da se postavi.

package DomaciKlase.Sport;

public class Sportista {
    private String imeIPrezime;
    private String sportKojimSeBavi;
    private String klub;
    private int brojNaDresu;

    public Sportista(String imeIPrezime, String sportKojimSeBavi, String klub, int brojNaDresu){
        this.imeIPrezime = imeIPrezime;
        this.sportKojimSeBavi = sportKojimSeBavi;
        this.klub = klub;
        this.brojNaDresu = brojNaDresu;
    }
    public String getImeIPrezime(){
        return imeIPrezime;
    }
    public String getSportKojimSeBavi(){
        return sportKojimSeBavi;
    }
    public String getKlub(){
        return klub;
    }
    public int getBrojNaDresu(){
        return brojNaDresu;
    }
    public void setKlub(String klub){
        this.klub = klub;
    }
    public void setBrojNaDresu(int broj){
        brojNaDresu = broj;
    }


}
