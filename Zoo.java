import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Zoo {
    static HashMap<String, Integer> animals = new HashMap<String, Integer>();

    public static void printSortedAnimals() {
        TreeMap<String, Integer> sorted = new TreeMap<String, Integer>();

        sorted.putAll(animals);

        // Display the TreeMap which is naturally sorted
        for (Map.Entry<String, Integer> entry : sorted.entrySet())
            System.out.println(entry.getKey()+" | "+ entry.getValue());

        sorted.clear();
    }
    public static void main (String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = 1;
        int listN = 1;
        while (n != 0) {
            n = Integer.parseInt(br.readLine());
            for (int i = 0; i < n; i++) {
                String[] animal = br.readLine().split(" ");
                int last = animal.length;
                String nameOfAnimal = animal[last - 1].toLowerCase();
                if (animals.containsKey(nameOfAnimal)) {
                    animals.replace(nameOfAnimal, animals.get(nameOfAnimal) + 1);
                } else {
                    animals.put(nameOfAnimal, 1);
                }
            }

            if (n != 0) {
                System.out.printf("List %d:\n", listN);
                printSortedAnimals();
            }

            animals.clear();
            listN += 1;
        }
    }
}
