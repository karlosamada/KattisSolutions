import java.util.Scanner;

public class heliocentric {

    public static boolean isNewYear (int earth, int mars) {
        if (earth == 0 && mars == 0) {
            return false;
        }

        return true;
    }

    public static void main (String [] args) throws  Exception {
        Scanner sc = new Scanner(System.in);
        int caseNum = 1;
        while(sc.hasNext()) {
            int e = sc.nextInt();
            int m = sc.nextInt();

            int days = 0;
            while (isNewYear(e, m)) {
                e++;
                m++;

                if (e > 364) e = 0;
                if (m > 686) m = 0;

                days++;
            }

            System.out.printf("Case %d: %d\n", caseNum, days);
            caseNum++;
        }
    }
}
