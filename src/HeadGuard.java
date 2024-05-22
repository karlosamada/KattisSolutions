import java.util.Scanner;

public class HeadGuard {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()) {
            String word = sc.next() + 'A';

            int count = 0;
            String summary = "";
            char currentChar = word.charAt(0);
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == currentChar) {
                    // add count of the same
                    count++;
                } else if (word.charAt(i) != currentChar) {
                    // summarize counted char then reset the current char and count
                    summary += Integer.toString(count)+word.charAt(i-1);
                    currentChar = word.charAt(i);
                    count = 1;
                }
            }

            System.out.println(summary);
        }

        sc.close();
    }
}
