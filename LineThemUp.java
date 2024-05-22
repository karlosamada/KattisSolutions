import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class LineThemUp {

    public static void main (String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        ArrayList<String> names = new ArrayList<String>();
        ArrayList<String> sortedNames = new ArrayList<String>();

        for (int i = 0; i < n; i++) {
            String name = br.readLine();
            names.add(name);
            sortedNames.add(name);
        }

        Collections.sort(sortedNames);

        if (names.equals(sortedNames) == true) {
            System.out.println("INCREASING");
        } else {
            Collections.reverse(sortedNames);
            if (names.equals(sortedNames)) {
                System.out.println("DECREASING");
            } else {
                System.out.println("NEITHER");
            }
        }
    }
}
