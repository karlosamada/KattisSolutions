import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Hardware {
    public static void main (String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        // + First, Last, Interval
        for (int i = 0; i < n; i++) {
            String roadName = br.readLine();
            String address = br.readLine();
            String[] addresses = address.split(" ");

            int addressCount = 0;
            int totalDigits = 0;
            int[] digit = new int[10];

            while(addressCount != Integer.parseInt(addresses[0])) {
                String[] order = br.readLine().split(" ");
                // 101 103 105 107 109 111 113 115 117 119 121 123 125
                if (order[0].equals("+")) {
                    // Multiline
                    int first = Integer.parseInt(order[1]);
                    int interval = Integer.parseInt(order[3]);
                    int last = Integer.parseInt(order[2]) + interval;

                    while(first != last) {
                        for(int j = 0; j < (int) (Math.log10(first) + 1); j++) {
                            int intChar = Character.getNumericValue(Integer.toString(first).charAt(j));
                            digit[intChar] += 1;
                            totalDigits++;
                        }
                        first += interval;
                        addressCount++;
                    }
                } else {
                    for(int j = 0; j < (int) (Math.log10(Integer.parseInt(order[0])) + 1); j++) {
                        int intChar = Character.getNumericValue(order[0].charAt(j));
                        digit[intChar] += 1;
                        totalDigits++;
                    }
                    addressCount++;
                }

            }

            System.out.println(roadName);
            System.out.println(address);
            for (int j = 0; j < 10; j++) {
                System.out.printf("Make %d digit %d\n", digit[j], j);
            }

            if (totalDigits > 1) {
                System.out.printf("In total %d digits\n", totalDigits);
            } else {
                System.out.printf("In total %d digit\n", totalDigits);
            }
        }
    }
}
