import java.util.Scanner;
public class NaizmenicnaSuma {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite neki ceo, pozitivan broj: ");
        int n = s.nextInt();
        int su = 0;

        while ( n >= 1){
            if (n % 2 == 0) {
                su -= n;
            }
         else{
            su += n;
        }
            n--;
    }
        System.out.println(su);
    }
}

