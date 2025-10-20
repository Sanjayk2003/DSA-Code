import java.util.*;

class ShuffleNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  // Number of test cases
        int[][] ranges = new int[t][2];

        // Read input ranges
        for (int i = 0; i < t; i++) {
            ranges[i][0] = sc.nextInt();
            ranges[i][1] = sc.nextInt();
        }

        // Process each range and insert elements in shuffled order
        for (int i = 0; i < t; i++) {
            int start = ranges[i][0], end = ranges[i][1];
            int size = end - start + 1;
            int[] shuffledNumbers = new int[size];
            boolean[] used = new boolean[size];

            Random rand = new Random();
            for (int j = 0; j < size; j++) {
                int num;
                do {
                    num = rand.nextInt(size); // Generate a random index
                } while (used[num]);  // Ensure the number is not already used
                
                used[num] = true;
                shuffledNumbers[num] = start + j; // Insert number at random index
            }

            // Print the shuffled numbers
            for (int num : shuffledNumbers) {
                System.out.print(num + " ");
            }
            System.out.println();  // New line for next test case
        }

        sc.close();
    }
}
