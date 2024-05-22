import java.util.Scanner;
public class Server {
    public static void main (String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int queue = Integer.parseInt(sc.next());
        int availableRuntime = Integer.parseInt(sc.next());

        int tasks = 0;
        int[] minutes = new int[queue];
        for (int i = 0; i < queue; i++) {
            minutes[i] = Integer.parseInt(sc.next());
            if (availableRuntime >= minutes[i]) {
                availableRuntime -= minutes[i];
                tasks++;
            } else {
                break;
            }
        }
        System.out.printf("%d", tasks);
    }
}
