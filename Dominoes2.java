import java.util.*;

public class Dominoes2 {
    private static int n, m, l;
    private static int knocked = 0;
    public void go() {
        Scanner sc = new Scanner(System.in);
        int tcs = sc.nextInt();
        for (int i = 0; i < tcs; i++) {
            n = sc.nextInt(); // number of dominoes
            m = sc.nextInt(); // block a -> block b
            l = sc.nextInt(); // knocked by hand

            Vertex[] vertex = new Vertex[n];
            for (int j = 0; j < n; j++) {
                vertex[j] = new Vertex(j);
            }

            for (int j = 0; j < m; j++) {
                int x = sc.nextInt() - 1;
                int y = sc.nextInt() - 1;

                vertex[x].add(vertex[y]);
            }

            knocked = 0;
            LinkedList<Vertex> stack = new LinkedList<>();

            for (int j = 0; j < l; j++) {
                int tap = sc.nextInt() - 1;

//                Recursion
//                if(!vertex[tap].visited) {
//                    dfs(vertex[tap]);
//                }


                if(!vertex[tap].visited) {
                    stack.push(vertex[tap]);
                    knocked++;
                    while(!stack.isEmpty()) {
                        Vertex curr = stack.pop();
                        curr.visited = true;

                        for(Vertex other : curr.others) {
                            if (other.visited) {
                                continue;
                            }

                            if (!stack.contains(other)) {
                                stack.add(other);
                                knocked++;
                            }
                        }
                    }
                }
            }
            System.out.println(knocked);
        }

        sc.close();
    }

    ////                Recursion
    public static void dfs(Vertex v) {
        v.visited = true;
        knocked++;

        for(Vertex other: v.others) {
            if (!other.visited) {
                dfs(other);
            }
        }

    }

    public static void main(String[] args) throws Exception {
        new Dominoes2().go();
    }

    private class Vertex {
        int index;
        boolean visited;
        ArrayList<Vertex> others;

        public Vertex(int i) {
            index = i;
            visited = false;
            others = new ArrayList<>();
        }

        public void add(Vertex other) {
            others.add(other);
        }
    }
}