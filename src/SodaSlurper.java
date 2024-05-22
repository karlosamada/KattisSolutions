import java.io.*;

public class SodaSlurper {
    public static void main (String[] args) throws Exception  {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");

        int bottles = Integer.parseInt(input[0]) + Integer.parseInt(input[1]);
        int req = Integer.parseInt(input[2]);
        int sodas = 0;

        while(bottles - req >= 0) {
            bottles -= req;
            bottles++;
            sodas++;
        }
        System.out.println(sodas);
        br.close();
    }
}
