import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        System.out.println(reader.nextInt());
        for(int j = 0; j < n; j++)
            reader.next();

        reader.close();
    }
}
