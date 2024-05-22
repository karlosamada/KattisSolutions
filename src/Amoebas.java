import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Amoebas {


    private static int iterations[][] = {
        {-1, -1}, // top left
        {-1, 0}, // top
        {-1, 1}, // top right
        {0, -1}, // left
        {0, 1}, // right
        {1, -1}, // bottom left
        {1, 0}, // bottom
        {1, 1}, // bottom right
    };
    public static void gridAssignment(Character[][] grid,Integer[][] visited, String input, Integer m) {
        for (int i = 0; i < input.length(); i++) {
            grid[m][i] = input.charAt(i);
            visited[m][i] = 0;
        }
    }

    public static boolean isValid (Integer x, Integer y, Integer m, Integer n) {
        return x < m && x >= 0 && y < n && y >= 0;
    }

    public static void bfs (Queue<int []> queue, Character[][] grid, Integer[][] visited, Integer i, Integer j, Integer m, Integer n) {
        queue.add(new int[] {i, j});
        visited[i][j] = 1;

        while(!queue.isEmpty()) {
            int[] action = queue.remove();
            int x = action[0];
            int y = action[1];

            for (int k = 0; k < iterations.length; k++) {

                Integer newX = x + iterations[k][0];
                Integer newY = y + iterations[k][1];

                if (isValid(newX, newY, m, n)) {
                    if (grid[newX][newY] == '#' && visited[newX][newY] == 0) {
                        queue.add(new int[] { newX, newY});
                        visited[newX][newY] = 1;
                    }
                }
            }
        }

    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] inputs = br.readLine().split(" ");
        Integer m = Integer.parseInt(inputs[0]);
        Integer n = Integer.parseInt(inputs[1]);
        Character[][] grid = new Character[m][n];
        Integer[][] visited = new Integer[m][n];
        Queue<int []> queue = new LinkedList<>();


        for (int i = 0; i < m; i++) {
            String line = br.readLine();
            gridAssignment(grid, visited, line, i);
        }

        Integer amoebas = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '#' && visited[i][j] == 0) {
                    bfs(queue, grid, visited, i, j, m , n);
                    amoebas++;
                }
            }
        }

        System.out.println(amoebas);
    }
}
