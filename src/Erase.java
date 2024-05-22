import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Erase {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Integer n = Integer.parseInt(br.readLine());
        String first = br.readLine();
        String second = br.readLine();
        boolean success = true;

        if (n % 2 == 0) {
            for(int i = 0; i < first.length(); i++) {
                if(first.charAt(i) != second.charAt(i)) {
                    success = false;
                    break;
                }
            }
        } else {
            for(int i = 0; i < first.length(); i++) {
                char opposite = first.charAt(i) == '1' ? '0' : '1';
                if (opposite != second.charAt(i)) {
                    success = false;
                    break;
                }
            }
        }

        if(success) {
            System.out.println("Deletion succeeded");
        } else {
            System.out.println("Deletion failed");
        }
    }
}
