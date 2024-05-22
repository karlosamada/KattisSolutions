import java.util.*;
import java.io.*;

public class CutInLine {
	public static void main (String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<String> list = new LinkedList<String>();
		int n = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < n; i++) {
			list.add(br.readLine());
		}
		
		int iterations = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < iterations; i++) {
			String[] action = br.readLine().split(" ");
			
			if (action[0].equals("cut")) {
				int index = list.indexOf(action[2]);
				list.add(index, action[1]);
			} else {
				int index = list.indexOf(action[1]);
				list.remove(index);
			}
		}
		
		br.close();
		
		list.forEach((myList) -> {
			System.out.println(myList);
		});
	}
}
