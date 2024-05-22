import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;

public class HayPoints {
    public static void main(String[] args) throws  Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] actions = br.readLine().split(" ");

        int numWords = Integer.parseInt(actions[0]);
        int numDescription = Integer.parseInt(actions[1]);

        HashMap<String, Integer> hayPoints = new HashMap<String, Integer>();
        for(int i = 0; i < numWords; i++) {
            String[] hayPoint = br.readLine().split(" ");
            hayPoints.put(hayPoint[0], Integer.parseInt(hayPoint[1]));
        }

        for(int i = 0; i < numDescription; i++) {
            String description = "";
            String text = "";

            while(!text.equals(".")) {
                text = br.readLine();
                description += " " + text;
            }

            int point = 0;
            String[] desc = description.split(" ");
            for (int j = 0; j < desc.length; j++) {
                if (j == desc.length -1) {
                    if (hayPoints.containsKey(desc[j]+".")) {
                        point += hayPoints.get(desc[j]);
                    }
                } else if (hayPoints.containsKey(desc[j])) {
                    point += hayPoints.get(desc[j]);
                }
            }

            System.out.println(point);
        }
    }
}
