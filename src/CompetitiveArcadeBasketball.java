import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

public class CompetitiveArcadeBasketball {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> scoreBoard = new HashMap<String, Integer>();
        ArrayList<String> winners = new ArrayList<String>();

        String[] inputs = br.readLine().split(" ");
        for (int i = 0; i < Integer.parseInt(inputs[0]); i++) {
            String name = br.readLine();
            scoreBoard.put(name, 0);
        }

        for(int i = 0; i < Integer.parseInt(inputs[2]); i++) {
            String[] scores = br.readLine().split(" ");
            Integer currentScore = scoreBoard.get(scores[0]) + Integer.parseInt(scores[1]);
            scoreBoard.replace(scores[0], currentScore);

            if (currentScore >= Integer.parseInt(inputs[1])) {
                if (!winners.contains(scores[0])) {
                    winners.add(scores[0]);
                    System.out.println(scores[0]+" wins!");
                }
            }
        }

        if(winners.isEmpty()) {
            System.out.println("No winner!");
        }

    }
}
