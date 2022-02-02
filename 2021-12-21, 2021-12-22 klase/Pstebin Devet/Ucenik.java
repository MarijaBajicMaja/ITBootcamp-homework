//Napisati klasu Ucenik koja ima sledeca polja:
//	- String ime
//	- String prezime
//	- ArrayList ocene
//
//Napisati 2 konstruktora, jedan koji prima argumente za sva polja, a drugi koji prima ime i prezime, a ocene postavlja na praznu listu.
//Napisati gettere i settere za sva polja.
//Napisati toString() metod:
//	{ime} i {prezime} ima ocene:
//	{ocene}
//Napisati metod proske koji racuna prosek Ucenika.

package DomaciKlase.PstebinDevet;

import java.util.ArrayList;

public class Ucenik {
    private String ime;
    private String prezime;
    private ArrayList<Integer> ocene;

    public Ucenik(String ime, String prezime, ArrayList ocene){
        this.ime = ime;
        this.prezime = prezime;
        this.ocene = ocene;
    }
    public Ucenik(String ime, String prezime){
        this.ime = ime;
        this.prezime = prezime;
        ArrayList<Integer> ocene = new ArrayList<Integer>();
    }

    public String getIme(){
        return ime;
}
public String getPrezime(){
        return prezime;
}
public ArrayList<Integer> getOcene() {
        return ocene;
    }

  public void setIme(String ime){
        this.ime = ime;
  }
  public void setPrezime(String prezime){
        this.prezime = prezime;
  }
  public void setOcene(ArrayList<Integer> ocene){
        this.ocene = ocene;
  }

  public String toString(){
        StringBuilder sb = new StringBuilder();

        sb.append(ime);
        sb.append(" ");
        sb.append(prezime);
      sb.append(" ima ocene:");
      sb.append("\n");
      for(Integer ocena : ocene){
          sb.append(ocena);
          sb.append("\n");
      }
      return toString();
  }

  public double prosek(ArrayList<Integer> ocene){
        double p = 0.0;
        double sum = 0.0;
      for( Integer ocena : ocene){
          sum += ocena;
      }
      p = sum / ocene.size();
      return p;
  }
}
