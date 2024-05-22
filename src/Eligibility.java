import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Eligibility {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        SimpleDateFormat sd = new SimpleDateFormat("YYYY/MM/DD");
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String[] contestants = br.readLine().split(" ");
            Date date1 = sd.parse(contestants[1]);
            Date birth = sd.parse(contestants[2]);
            String petition = "Petition";

            if (date1.after(sd.parse("2009/12/31"))) {
                System.out.println(contestants[0]+ " eligible");
                continue;
            }

            if (birth.after(sd.parse("1990/12/31"))) {
                System.out.println(contestants[0]+ " eligible");
                continue;
            }

            if (Integer.parseInt(contestants[3]) <= 40) {
                System.out.println(contestants[0]+ " coach petitions");
            } else {
                System.out.println(contestants[0]+ " ineligible");
            }
        }
    }
}
