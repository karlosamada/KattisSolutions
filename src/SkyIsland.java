import java.util.*;
public class SkyIsland {
    static ArrayList<Integer>[] aList;
    static boolean[] visited;

    public static void dfs(Integer node) {
        visited[node] = true;

        for (Integer i : aList[node]) {
            if (!visited[i]) {
                dfs(i);
            }
        }
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int nodes = sc.nextInt() + 1;
        int link = sc.nextInt();

        aList = new ArrayList[nodes];
        visited = new boolean[nodes];

        for (int i = 1; i < nodes; i++) {
            aList[i] = new ArrayList<Integer>();
        }

        for (int i = 0; i < link; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            aList[x].add(y);
        }

        dfs(1);

        boolean connected = true;
        for (int i = 1; i < nodes; i++) {
            if (!visited[i]) {
                System.out.println("NO");
                connected = false;
                break;
            }
        }

        if (connected) {
            System.out.println("YES");
        }


    }
}
