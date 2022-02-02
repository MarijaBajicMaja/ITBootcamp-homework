package DomaciKlase.PstebinDevet;

import java.util.ArrayList;

public class Odeljenje {
    private String oznaka;
    private ArrayList<Ucenik> dnevnik;

    public Odeljenje(String oznaka, ArrayList<Ucenik> dnevnik) {
        this.oznaka = oznaka;
        this.dnevnik = dnevnik;
    }
    public Odeljenje(String oznaka) {
        this.oznaka = oznaka;
        ArrayList<Ucenik> dnevnik = new ArrayList<Ucenik>();
    }

    public String getOznaka() {
        return oznaka;
    }
    public ArrayList<Ucenik> getDnevnik() {
        return dnevnik;
    }

    public void setOznaka(String oznaka) {
        this.oznaka = oznaka;
    }
    public void setDnevnik(ArrayList<Ucenik> dnevnik) {
        this.dnevnik = dnevnik;
    }


    public void upisiUcenika(Ucenik konkretanUcenik) {
        dnevnik.add(konkretanUcenik);
    }
    public void upisiUcenika(int redniBroj, Ucenik konkretanUcenik) {
        dnevnik.add(redniBroj, konkretanUcenik);
    }

    public void ispisUcenika(Ucenik konkretanUcenik) {
        dnevnik.remove(konkretanUcenik);
    }
    public void ispisiUcenika(int i){
        dnevnik.remove(i);
    }

    public void pogledajOcene(Ucenik konkretanUcenik) {
        System.out.println(konkretanUcenik.getOcene());
    }
    public void pogledajOcene(int i){
        Ucenik djak;
        for(int j = 0 ; j<dnevnik.size(); j++){
            if(j == i){
                djak = dnevnik.get(j);
                System.out.println(djak.getOcene());
            }
        }
    }


    public double prosecnaOcena(Ucenik konkretanUcenik){
        double prosecna = konkretanUcenik.prosek(konkretanUcenik.getOcene());
        return prosecna;
    }
    public double prosecnaOcena(int i) {
        double pr = 0.0;
        Ucenik djak;
        for (int j = 0; j < dnevnik.size(); j++) {
            if (j == i) {
                djak = dnevnik.get(j);
                pr = djak.prosek(djak.getOcene());
            }
        }
        return pr;
    }

    public double prosecnaOdeljenja(ArrayList<Ucenik> dnevnik){
        double prOdeljenja = 0.0;
        for(Ucenik konkretanUcenik: dnevnik){
prOdeljenja = konkretanUcenik.prosek(konkretanUcenik.getOcene()) / dnevnik.size();
        }
        return prOdeljenja;
    }


    public void opisnaOcena(Ucenik u) {
        if (u.prosek(u.getOcene()) >= 4.5) {
            System.out.println("Odlican");
        } else if (u.prosek(u.getOcene()) >= 3.5) {
            System.out.println("Vrlo dobar");
        } else if (u.prosek(u.getOcene()) >= 2.5) {
            System.out.println("Dobar");
        } else if (u.prosek(u.getOcene()) >= 1.5) {
            System.out.println("Dovoljan");
        }
        else {
            System.out.println("Nedovoljan");
            //na znam kako sad da ubacim proveru za jedinicu, trenalo je valjda proveriti pre petlje...
        }
    }

    //Napisati metod izlistajDnevnik() koja vraca String oblika:
    //	{ime} i {prezime} ima ocene:
    //	{ocene}
    //za sve ucenike.  - ne stizem da se igram sa ovim, nisam nacisto kako bih resila, tj. kako bih
    //pokusala da to resim

    public String velicinaOdeljenja(ArrayList<Ucenik> dnevnik){
        String vrelicinaRazreda = "";
        if(dnevnik.size()>25){
            vrelicinaRazreda ="Veliko odeljenje";
        }
        else if(dnevnik.size()>15){
            vrelicinaRazreda = "Srednje odeljenje";
        }
        else if(dnevnik.size()>0){
            vrelicinaRazreda = "Malo odeljenje";
        }
        return vrelicinaRazreda;
    }



    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(oznaka+" ima djake:");
        sb.append("\n");

        for(Ucenik konkretanUcenik: dnevnik){
            sb.append(konkretanUcenik.getIme());
            sb.append(" ");
            sb.append(konkretanUcenik.getPrezime());
        }
        return sb.toString();
    }
}
