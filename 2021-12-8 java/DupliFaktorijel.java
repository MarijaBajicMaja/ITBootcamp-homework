import java.util.Scanner;
public class DupliFaktorijel {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Unesite neki ceo, pozitivan broj: ");
        int n = s.nextInt();
        int df = 1;

       /* if (n % 2 == 0) {
            for (int i = 2; i <= n; i += 2) {
                df *= i;
            }
        } else {
            for (int i = 1; i <= n; i += 2) {
                df *= i;
            }
        }*/
   for(int i = n; i > 0; i -= 2) {
                df = df * i;
            }

        System.out.println(df);
    }
}


