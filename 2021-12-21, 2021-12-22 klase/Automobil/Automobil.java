package DomaciKlase.Automobil;

import Klase.Osoba;

public class Automobil {
    private String marka;
    private String model;
    private int serijskiBroj;
    private Osoba vlasnik;

    public Automobil(String marka, String model, int serijskiBroj, Osoba vlasnik) {
        this.marka = marka;
        this.model = model;
        this.serijskiBroj = serijskiBroj;
        this.vlasnik = vlasnik;
    }
    public Automobil(String marka, String model, int serijskiBroj){
        this.marka = marka;
        this.model = model;
        this.serijskiBroj = serijskiBroj;
        this.vlasnik = null;
    }
    public String getMarka(){
        return marka;
    }

    public String getModel() {
        return model;
    }

    public int getSerijskiBroj() {
        return serijskiBroj;
    }

    public Osoba getVlasnik() {
        return vlasnik;
    }

    public void setVlasnik(Osoba vlasnik) {
        this.vlasnik = vlasnik;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Marka:");
        sb.append(marka);
        sb.append("\n");
        sb.append("Model:");
        sb.append(model);
        sb.append("\n");
        sb.append("Serijski broj:");
        sb.append(serijskiBroj);
        sb.append("\n");
        if(vlasnik == null) {
            System.out.println("Nema podataka za vlasnika.");
        }
        else{
        sb.append("Vlasnik:");
        sb.append(vlasnik);
        sb.append("\n");}

        return sb.toString();
    }

}
