import java.util.Scanner;

public class AboveAverage {

    public static String toPercentage(float n){
        return String.format("%.3f",n)+"%";
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();

        for (int i = 0; i < c; i++) {
            int n = sc.nextInt();
            int[] grades = new int[n];
            int sum = 0;
            float passers = 0;
            for (int j = 0; j < n; j++) {
                grades[j] = sc.nextInt();
                sum += grades[j];
            }

            int average = sum / n;
            for (int j = 0; j < n; j++) {
                if (grades[j] > average) {
                    passers++;
                }
            }

            float answer = (passers / n) * 100;

            System.out.println(toPercentage(answer));
        }
    }
}
