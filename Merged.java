import java.util.LinkedList;
import java.util.List;

public class Merged {

    LinkedList<Node> l;

    Merged() {
        l = new LinkedList<>();
    }

    public class Node {  // FIX: Made public for access outside the class
        private int st;
        private int end;

        Node(int st, int end) {
            this.st = st;
            this.end = end;
        }

        @Override
        public String toString() {  // Added for easy printing
            return "[" + st + ", " + end + "]";
        }
    }

    void add(int a, int b) {
        l.add(new Node(a, b));
    }

    void display() {
        for (Node n : l) {
            System.out.println(n.st + "  " + n.end);
        }
    }

    List<Node> OverLap(LinkedList<Node> n) {
        if (n == null || n.isEmpty()) {  // FIX: Handle null or empty input
            return new LinkedList<>();
        }

        n.sort((a, b) -> Integer.compare(a.st, b.st));  // FIX: Sort intervals

        LinkedList<Node> merged = new LinkedList<>();
        Node current = n.get(0);
        int st = current.st;
        int end = current.end;

        for (int i = 1; i < n.size(); i++) {
            Node c = n.get(i);
            if (c.st <= end) {
                end = Math.max(end, c.end);
            } else {
                merged.add(new Node(st, end));
                st = c.st;
                end = c.end;
            }
        }
        merged.add(new Node(st, end));
        return merged;
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 3}, {2, 6}, {7, 9}};
        Merged m = new Merged();

        for (int[] interval : arr) {  // Simplified loop
            m.add(interval[0], interval[1]);
        }

        System.out.println("Original Intervals:");
        m.display();

        List<Node> merged = m.OverLap(m.l);
        System.out.println("\nMerged Intervals:");
        for (Node n : merged) {  // Print merged intervals
            System.out.println(n);
        }
    }
}
