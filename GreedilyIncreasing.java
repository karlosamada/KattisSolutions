//import java.io.BufferedReader;
//import java.io.InputStreamReader;
import java.util.*;

public class GreedilyIncreasing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> p = new ArrayList<Integer>();
        ArrayList<Integer> a = new ArrayList<Integer>();

        int n = sc.nextInt();
        int[] test = new int[n];
        for (int i = 0; i < n; i++) {
            p.add(sc.nextInt());
        }

        for (int i = 0; i < p.size(); i++) {
            if (p.get(i) > 0 && a.isEmpty()) {
                a.add(p.get(i));
            } else if (p.get(i) > a.get(a.size() - 1)) {
                a.add(p.get(i));
            }
        }

        System.out.println(a.size());
        for(Integer x : a) {
           System.out.print(x+" ");
        }
    }
}
