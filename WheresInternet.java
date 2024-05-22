import java.io.*;
import java.util.ArrayList;

public class WheresInternet {
    static ArrayList<Integer>[] aList;
    static int visited[];
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] actions = br.readLine().split(" ");
        int n = Integer.parseInt(actions[0]);
        int m = Integer.parseInt(actions[1]);

        aList = new ArrayList[n + 1];
        visited = new int[n + 1];

        for (int i = 1; i < n + 1; i++) {
            aList[i] = new ArrayList<Integer>();
        }

        for (int i = 0; i < m; i++) {
            String[] connections = br.readLine().split(" ");
            int x = Integer.parseInt(connections[0]);
            int y = Integer.parseInt(connections[1]);

            aList[x].add(y);
            aList[y].add(x);
        }

        dfs(1);

        boolean connected = true;
        for (int i = 1; i < n + 1; i++) {
             if (visited[i] == 0) {
                 System.out.println(i);
                 connected = false;
             }
        }

        if (connected) {
            System.out.println("Connected");
        }


    }

    public static void dfs(int node) {
        visited[node] = node;
        for (Integer i: aList[node]) {
            if (visited[i] == 0) {
                dfs(i);
            }
        }
    }
}
