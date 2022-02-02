import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Unesite neki broj: ");
        int n = s.nextInt();

        if(n % 2 == 0) {
            System.out.println("Paran");
        } else{
            System.out.println("Neparan");
        }
    }
}
