import java.util.*;

public class TimeBomb {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String[] data = new String[5];
		for (int i = 0; i<5; i++) {
			data[i] = sc.nextLine();
		}
		
		int len = (data[0].length() + 1);
		String sum = "";
		boolean invalidDigit = false;
		for (int i = 0; i < len; i += 4) {
			int item = convert(
					data[0].substring(i, i + 3),
					data[1].substring(i, i + 3),
					data[2].substring(i, i + 3),
					data[3].substring(i, i + 3),
					data[4].substring(i, i + 3)
					);
			
			if (item == -1) {
				invalidDigit = true;
				break;
			} else {
				sum = sum + item;	
			}
		}	
		
		if (invalidDigit) {
			System.out.println("BOOM!!");
		} else {
			if (Integer.parseInt(sum) % 6 == 0) {
				System.out.println("BEER!!");
			} else {
				System.out.println("BOOM!!");
			}
		}
	
		sc.close();
	}
	
	private static int convert (String a, String b, String c, String d, String e) {
		
		for (int i = 0; i < images.length; i++) {
			if (a.equals(images[i][0]) && b.equals(images[i][1]) && c.equals(images[i][2]) && d.equals(images[i][3]) && e.equals(images[i][4])) {
				return i;
			}
		}


		return -1;
	}
	
	private static String[][] images = {
			{"***", "* *", "* *", "* *", "***"},
			{"  *", "  *", "  *", "  *", "  *"},
			{"***", "  *", "***", "*  ", "***"},
			{"***", "  *", "***", "  *", "***"},
			{"* *", "* *", "***", "  *", "  *"},
			{"***", "*  ", "***", "  *", "***"},
			{"***", "*  ", "***", "* *", "***"},
			{"***", "  *", "  *", "  *", "  *"},
			{"***", "* *", "***", "* *", "***"},
			{"***", "* *", "***", "  *", "***"},
     };
}
	
	
	
