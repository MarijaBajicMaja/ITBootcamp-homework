//42. Napisati funkciju koja proverava da li u nizu niski imena
// postoji "Marija" ili "Petar".

package Pstebin;

import java.util.Scanner;

public class CetrdesetDva {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        String[] ime = new String[n];
        for( int i = 0; i< ime.length; i++){
            ime[i] = s.next();
        }

        boolean vraceni = imeNema(ime);
    }

   public static boolean imeNema(String[]y){
        boolean b = true;
        for(int j = 0; j< y.length;j++){
            if(y[j].equals("Marija") || y[j].equals("Petar")){
                b = true;
                break;
            }
            else{
                b=false;
            }
        }
        return b;
    }

}
