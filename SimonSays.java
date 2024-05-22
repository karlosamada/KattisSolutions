import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.*;

public class SimonSays {
    public static void main (String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        List<String> output = new ArrayList<String>();
        for (int i = 0; i < n; i++) {
            String word = br.readLine();
            String[] words = word.split(" ");
            String finals = "";
            StringJoiner s = new StringJoiner(" ");
            for (int j = 0; j < words.length; j++) {
                if (j > 1) {
                    s.add(words[j]);
                }
            }

            if (word.startsWith("Simon says")) {
                output.add(s.toString());
            }
        }

        for(int i = 0; i < output.size(); i++) {
            System.out.println(output.get(i));
        }
    }
}
