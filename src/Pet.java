import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int[][] grades = new int[5][4];
        int h = 0, ch = 0, chi = 0;
        for(int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j ++) {
                grades[i][j] = reader.nextInt();
                h += grades[i][j];
            }
            if (h > ch) {
                chi = i;
                ch = h;
            }
            h = 0;
        }

        reader.close();
        System.out.println(chi+1 + " " +ch);
    }
}
