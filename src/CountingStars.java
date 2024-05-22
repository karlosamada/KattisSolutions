import java.util.*;

public class CountingStars {
    private static int[][] actions= {
        {-1, 0}, // Check top
        {0, 1}, // Check right
        {1, 0}, // Check down
        {0, -1}, // check left
    };
    public static void gridAssignment(Character[][] grid, Integer[][] visitedGrid,String[] sGrid, int m, int n) {
        for (int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                grid[i][j] = sGrid[i].charAt(j);
                visitedGrid[i][j] = 0;
            }
        }
    }

    // x, y. m, n
    public static boolean isValid(int r, int c, int R, int C) {
        return r < R && r >= 0 && c >= 0 && c < C;
    }

    public static void bfs(Queue<int[]> queue, Integer[][] visitedGrid, Character[][] grid, int i, int j, int n, int m) {
        queue.add(new int[] {i, j});

        visitedGrid[i][j] = 1;
        while(!queue.isEmpty()) {


            int[] coordinates = queue.remove();
            if (isValid(coordinates[0], coordinates[1], m, n)) {

            }

            for(int k = 0; k < actions.length; k++) {
                int newX = coordinates[0] + actions[k][0];
                int newY = coordinates[1] + actions[k][1];
                if(isValid(newX, newY, m, n) && grid[newX][newY] == '-' && visitedGrid[newX][newY] == 0) {
                    queue.add(new int[] {newX, newY});
                    visitedGrid[newX][newY] = 1;
                }

            }
//
//            // RIGHT
//            if(coordinates[1]+1 < n) {
//                if (visitedGrid[coordinates[0]][coordinates[1] + 1] == 0 && grid[coordinates[0]][coordinates[1] + 1] == '-') {
//                    queue.add(new int[] {coordinates[0], coordinates[1] + 1});
//                    visitedGrid[coordinates[0]][coordinates[1] + 1] = 1;
//                }
//            }
//
//            //Down
//            if(coordinates[0]+1 < m) {
//                if (visitedGrid[coordinates[0] + 1][coordinates[1]] == 0 && grid[coordinates[0] + 1][coordinates[1]] == '-') {
//                    queue.add(new int[] {coordinates[0] + 1, coordinates[1]});
//                    visitedGrid[coordinates[0] + 1][coordinates[1]] = 1;
//                }
//            }
//
//            //LEFT
//            if(coordinates[1] - 1 >= 0) {
//                if (visitedGrid[coordinates[0]][coordinates[1] - 1] == 0 && grid[coordinates[0]][coordinates[1] - 1] == '-') {
//                    queue.add(new int[] {coordinates[0], coordinates[1] - 1});
//                    visitedGrid[coordinates[0]][coordinates[1] - 1] = 1;
//                }
//            }
//
//            //UP
//            if(coordinates[0] - 1 >= 0) {
//                if (visitedGrid[coordinates[0] - 1][coordinates[1]] == 0 && grid[coordinates[0] - 1][coordinates[1]] == '-') {
//                    queue.add(new int[] {coordinates[0] - 1, coordinates[1]});
//                    visitedGrid[coordinates[0] - 1][coordinates[1]] = 1;
//                }
//            }
        }
    }
    public static void main (String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int cases = 1;
        while(sc.hasNext()) {
            int m = sc.nextInt();
            int n = sc.nextInt();

            Character[][] grid = new Character[m][n];
            Integer[][] visitedGrid = new Integer[m][n];
            String[] stringGrid = new String[m];
            Queue<int[]> q = new LinkedList<>();


            int cluster = 0;
            for(int i = 0; i < m; i++) {
                stringGrid[i] = sc.next();
            }

            gridAssignment(grid, visitedGrid ,stringGrid, m , n);

            for(int i = 0; i < m; i++) {
                for(int j = 0; j < n; j++) {
                    if (grid[i][j] == '-' && visitedGrid[i][j] == 0) {
                        bfs(q, visitedGrid, grid, i, j, n, m);
                        cluster++;
                    }
                    visitedGrid[i][j] = 1;
                }
            }

            System.out.printf("Case %d: %d\n", cases++, cluster);
        }

    }
}
