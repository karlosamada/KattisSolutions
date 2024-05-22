import java.util.Scanner;

public class Barcelona {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int j = sc.nextInt();
            if (j == k) {
                if (i == 0) {
                    System.out.println("fyrst");
                    break;
                } else if (i == 1) {
                    System.out.println("naestfyrst");
                } else {
                    System.out.println(i + 1 + " fyrst");
                }
            }


        }
    }
}
