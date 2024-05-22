import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class SecureDoors {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        ArrayList<String> inside = new ArrayList<String>();
        ArrayList<String> output = new ArrayList<String>();

        for(int i = 0; i < n; i++) {
            String[] word = br.readLine().split(" ");

            if (word[0].equals("entry")) {
                if (inside.contains(word[1])) {
                    output.add(word[1] + " " + "entered" + " (ANOMALY)");
                } else {
                    output.add(word[1] + " " + "entered");
                    inside.add(word[1]);
                }
            } else {
                if (inside.contains(word[1])) {
                    inside.remove(word[1]);
                    output.add(word[1] + " " + "exited");
                } else {
                    output.add(word[1] + " " + "exited" + " (ANOMALY)");
                }
            }
        }

        for(int i = 0; i < output.size(); i++) {
            System.out.println(output.get(i));
        }
    }
}
