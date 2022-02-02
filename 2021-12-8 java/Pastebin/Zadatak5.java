import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Unesite pozitivan, ceo broj: ");
        int n = s.nextInt();

        for(int i = -14; i <= 2*n; i++){
            System.out.println(i);
        }
    }
}
