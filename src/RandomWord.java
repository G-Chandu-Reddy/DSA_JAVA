import edu.princeton.cs.algs4.Knuth;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class RandomWord {
    public static void main(String[] args) {
        String string = null;
        while (!StdIn.isEmpty()) {
            string = StdIn.readString();
        }

        String[] strings = string.split(" ");
        Knuth.shuffle(strings);
        StdOut.println(strings[0]);
    }
}
