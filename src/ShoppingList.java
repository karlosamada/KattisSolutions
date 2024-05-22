import javax.rmi.ssl.SslRMIClientSocketFactory;
import java.io.*;
import java.util.*;

public class ShoppingList {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bo = new BufferedWriter(new OutputStreamWriter(System.out));
        final int[] counter = {0};

        TreeMap<String, Integer> groceryList = new TreeMap<>();
        String[] params = br.readLine().split(" ");
        int n = Integer.parseInt(params[0]);
        int m = Integer.parseInt(params[1]);

        for (int i = 0; i < n; i++) {
            String[] list = br.readLine().split(" ");
            for (int j = 0; j < m; j++) {
                if (!groceryList.containsKey(list[j])) {
                    groceryList.put(list[j], 1);
                } else {
                    groceryList.replace(list[j], groceryList.get(list[j]) + 1);
                }
            }
        }

        for (Map.Entry<String, Integer> entry : groceryList.entrySet()) {
            String key = entry.getKey();
            Integer val = entry.getValue();

            if (val == n) {
                counter[0]++;
                bo.write(key+"\n");
            }
        }

        System.out.println(counter[0]);

        br.close();
        bo.flush();
    }
}
