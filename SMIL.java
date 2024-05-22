import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        sc.close();

        String[] sSmile = {":)" , ";)"};

        String[] bSmile = {":-)" , ";-)"};

        for(int i = 0; i < input.length(); i++) {
            if (i+2 > input.length()) return;
            if (input.substring(i, i+2).contains(sSmile[0]) || input.substring(i, i+2).contains(sSmile[1]))
                System.out.println(i);
            if (i+3 > input.length()) return;
            if (input.substring(i, i+3).contains(bSmile[0]) || input.substring(i, i+3).contains(bSmile[1]))
                System.out.println(i);
        }
        System.out.println(input.length());
    }
}
