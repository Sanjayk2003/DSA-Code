import java.util.*;

class LongestSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next(); // Read input string
        sc.close();

        Map<Character, Integer> firstOccurrence = new HashMap<>();
        int maxLength = 0;

        // Traverse the string to find first and last occurrence of each character
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (!firstOccurrence.containsKey(ch)) {
                firstOccurrence.put(ch, i); // Store first occurrence
            } else {
                // Calculate length excluding the character itself
                int length = i - firstOccurrence.get(ch) - 1;
                maxLength = Math.max(maxLength, length);
            }
        }

        System.out.println(maxLength);
    }
}
 