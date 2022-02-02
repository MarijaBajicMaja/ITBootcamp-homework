//1) Ispisite podatke o nekom glumcu i glumici tako sto cete ime i prezime
// prikazati kao dve promenljive, pol kao karakter, godine kao integer,
// vasa ocena njih od 1 do 10 (sa decimalom) i
// da li je iz Srbije odgovorite preko booleana.
// Sve potrebno za glumca i glumicu da budu dva ispisa (edited)

package DomaciKlase.Glumci;

public class Glumci {
    private String imeGlumca;
    private String prezimeGlumca;
    private char pol;
    private int godine;
    private double ocena;
    private boolean daLiJeIzSrbije;

    public Glumci(String imeGlumca, String prezimeGlumca, char pol, int godine, double ocena, boolean daLiJeIzSrbije){
        this.imeGlumca = imeGlumca;
        this.prezimeGlumca = prezimeGlumca;
        this.pol = pol;
        this.godine = godine;
        if(ocena <= 0 || ocena >10) {
            System.out.println("Morate izabrati ocenu 1-10.");
        }
        else{
            this.ocena = ocena;
        }
        this.daLiJeIzSrbije = daLiJeIzSrbije;
    }
    public String getImeGlumca(){
        return imeGlumca;
    }

    public String getPrezimeGlumca() {
        return prezimeGlumca;
    }

    public char getPol() {
        return pol;
    }

    public int getGodine() {
        return godine;
    }

    public double getOcena() {
        return ocena;
    }

    public boolean getDrzava() {
        return daLiJeIzSrbije;
    }

    public void setImeGlumca(String imeGlumca){
        this.imeGlumca = imeGlumca;
    }

    public void setPrezimeGlumca(String prezimeGlumca) {
        this.prezimeGlumca = prezimeGlumca;
    }

    public void setPol(char pol) {
        this.pol = pol;
    }

    public void setGodine(int godine) {
        this.godine = godine;
    }

    public void setOcena(double ocena) {
        if (ocena <= 0 || ocena > 10) {
            System.out.println("Morate izabrati ocenu 1-10.");
        } else {
            this.ocena = ocena;
        }
    }

    public void setDaLiJeIzSrbije(boolean daLiJeIzSrbije) {
        this.daLiJeIzSrbije = daLiJeIzSrbije;
    }

    public String toString(){
            StringBuilder sb = new StringBuilder();

        sb.append("Ime glumca: ");
        sb.append(imeGlumca);
        sb.append("\n");

        sb.append("Prezime glumca: ");
        sb.append(prezimeGlumca);
        sb.append("\n");

        sb.append("Pol: ");
        sb.append(pol);
        sb.append("\n");

        sb.append("Godine: ");
        sb.append(godine);
        sb.append("\n");

        sb.append("Ocena: ");
        sb.append(ocena);
        sb.append("\n");

        if(daLiJeIzSrbije == true){
            sb.append("Poreklom je iz Srbije.");
            sb.append("\n");
        }
        else{
            sb.append("U pitanju je strani glumac/glumica.");
            sb.append("\n");
        }
        return sb.toString();
    }
}
