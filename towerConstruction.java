import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] bricks = new int[n - 1];
        int tower = 1;
        int prev = sc.nextInt();
        for (int i = 0; i < n - 1; i++) {
            bricks[i] = sc.nextInt();
            if (bricks[i] > prev) tower++;
            prev = bricks[i];
        }


        System.out.println(tower);

    }
}