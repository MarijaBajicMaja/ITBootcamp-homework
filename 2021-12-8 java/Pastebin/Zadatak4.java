import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Unesite negativan, ceo broj: ");
        int n = s.nextInt();

        for(int i = n; i<=0; i++){
            System.out.println(i);
        }
    }
}
