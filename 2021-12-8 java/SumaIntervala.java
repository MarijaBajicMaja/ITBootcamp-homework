import java.util.Scanner;

public class SumaIntervala {

    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
        System.out.println("Unesite dva cela broja: ");
        int m = s.nextInt();
        int n = s.nextInt();
        int sum = 0;

if(m <= n){
            for(m = m; m <= n; m++){
            sum = sum + m;}

        System.out.println(sum);}

    }
}
