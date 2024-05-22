import java.util.Scanner;

public class Hradgreining {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean contains = sc.next().contains("COV");
        System.out.println(contains ? "Veikur!" : "Ekki veikur!");
    }
}
