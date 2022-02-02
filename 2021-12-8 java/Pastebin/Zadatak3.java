import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Unesite pozitivan, ceo broj: ");
        int n = s.nextInt();

        for(int i = 0; i<=n; i++){
            System.out.println(i);
        }
    }
}
