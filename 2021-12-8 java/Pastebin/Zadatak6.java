import java.util.Scanner;

public class Zadatak6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Unesite ceo, pozitivan broj: ");
        int n = s.nextInt();
        int p = 1;

        for(n = n; n >= 1; n--){
            p *= n;
        }
        System.out.println(p);
    }
}
