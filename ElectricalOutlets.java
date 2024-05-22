import java.util.Scanner;

public class ElectricalOutlets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int j = sc.nextInt();
            int count = 0;
            for (int k = 0; k < j; k++) {
                count += sc.nextInt() - 1;

                if (k + 1 == j) {
                    count++;
                }
            }

            System.out.println(count);
        }
    }
}
