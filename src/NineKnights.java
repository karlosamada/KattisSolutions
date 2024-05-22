import java.io.*;

public class NineKnights {

    private static int[][] iterations = {
            {2,1},{2, -1},{-1,2},
            {1,2},{-2, 1},{-2,-1},
            {1,-2},{-1, -2}
    };

    private static boolean isValid(int c, int r) {
        return c < 5 && c >= 0 && r >= 0 && r < 5;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Character[][] board = new Character[5][5];
        boolean valid = true;
        int knights = 0;
        for(int i=0; i<5; i++) {
            String word = br.readLine();
            for(int j = 0; j<word.length(); j++) {
                board[i][j] = word.charAt(j);
            }
        }


        for(int i =0; i<5; i++) {
            for(int j =0; j<5; j++) {
                if(valid && board[i][j] == 'k') {
                    knights++;
                    for (int k = 0; k < iterations.length; k++) {
                        int newX = i + iterations[k][0];
                        int newY = j + iterations[k][1];


                        if(isValid(newX, newY) && board[newX][newY] == 'k') {
                            valid = false;
                        }
                    }

                }
            }
        }

        if (valid && knights == 9) {
            System.out.println("valid");
        } else {
            System.out.println("invalid");
        }
    }
}
