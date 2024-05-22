import java.util.Scanner;

public class Recipes {
    public static void main (String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int R = sc.nextInt(); // X
        int S = sc.nextInt(); // Y
        int K = sc.nextInt(); //

        String[] window = new String[R];

        for(int i = 0; i < R; i++) {
            window[i] = sc.next();
        }

        int max = 0;
        int x = 0;
        int y = 0;
        for (int i = 0; i <= R-K; i++) {
            for (int j = 0; j <= S-K; j++) {
                int count = 0;
                for(int k = 1; k <= K - 2; k++) {
                    for(int l = 1; l <= K - 2; l++) {
                        if (window[i + k].charAt(j + l) == '*') {
                            count++;
                        }
                    }
                }
                if (count > max) {
                    max = count;
                    x = i;
                    y = j;
                }
            }
        }
        System.out.println(max);
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < S; j++) {
                int bot = S-K;
                if (i == x && y == j) {
                    System.out.print("+");
                } else if (i == (x + K-1) && j == y) {
                    System.out.print("+");
                } else if (i == x && j == (y + (K - 1))) {
                    System.out.print("+");
                } else if (i == (x + (K - 1)) && j == (y + (K - 1))) {
                    System.out.print("+");
                } else if (i == x && (j > y && j < (y + K))) {
                    System.out.print("-");
                } else if (i == x + (K - 1) && (j > y && j < (y + K))) {
                    System.out.print("-");
                } else if (j == y && (i > x && i < (x + K))) {
                    System.out.print("|");
                } else if (j == y + (K - 1) && (i > x && i < (x + K))) {
                    System.out.print("|");
                } else {
                    System.out.print(window[i].charAt(j));
                }
            }
            System.out.println();
        }
    }
}
