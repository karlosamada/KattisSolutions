import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Chopin {
    public static void main (String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int N = 1;
        while(sc.hasNext()) {
            String[] notes = {"A#" , "Bb" , "C#" , "Db" , "D#" , "Eb" , "F#" , "Gb" , "G#" , "Ab"};
            String note = sc.next();
            String chord = sc.next();

            if(note.length() == 1) {
                System.out.printf("Case %d: UNIQUE\n", N);
            } else {
                for (int i = 0; i < notes.length; i++) {
                    if (notes[i].equals(note)) {
                        if (i % 2 == 0) {
                            System.out.printf("Case %d: %s %s\n", N, notes[i+1], chord);
                        } else {
                            System.out.printf("Case %d: %s %s\n", N, notes[i-1], chord);
                        }
                    }
                }
            }

            N++;
        }
    }
}
