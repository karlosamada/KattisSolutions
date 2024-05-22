import java.util.Scanner;

public class Hipp2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word = sc.next();
        int count = sc.nextInt();

        for (int i = 0; i < count; i++) {
            System.out.println("Hipp hipp hurra, "+word+"!");
        }
    }
}
