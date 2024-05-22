import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        String[] names = new String[n+1];

        for(int j = 1; j < n + 1; j++)
            names[j] = reader.next();

        reader.close();

        for(int j = 1; j < n + 1; j++)
            if (j % 2 != 0)
                System.out.println(names[j]);
    }
}
