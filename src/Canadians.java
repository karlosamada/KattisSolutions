import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Canadians {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] word = br.readLine().split(" ");
        if (word[word.length - 1].equals("eh?")) {
            System.out.println("Canadian!");
        } else {
            System.out.println("Imposter!");

        }

    }
}
