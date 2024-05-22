import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");

        int n = sc.nextInt();
        int vol = 7;
        for (int i = 0; i < n; i++) {
            String request = sc.next();
            if (request.equals("Skru op!") && vol < 10) {
                vol++;
            } else if (request.equals("Skru ned!") && vol > 0) {
                vol--;
            }
        }

        sc.close();

        System.out.println(vol);
    }
}
