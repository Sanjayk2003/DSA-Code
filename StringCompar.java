import java.util.Scanner;

public class StringCompar{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Reading the input strings
        String s = sc.nextLine();
        String t = sc.nextLine();

        // Counters for the frequency of characters in t and s
        int[] counterT = new int[26];
        int[] counters = new int[26];

        // Count frequency of characters in string t
        for (int i = 0; i < t.length(); i++) {
            counterT[t.charAt(i) - 'a']++;
        }

        // Count frequency of characters in string s
        for (int i = 0; i < s.length(); i++) {
            counters[s.charAt(i) - 'a']++;
        }

        // Check for special condition (if there's exactly one character that has non-zero count in t)
        int special = 0;
        for (int i = 0; i < 26; i++) {
            if (counterT[i] != 0) {
                special++;
            }
        }

        // If special == 1, continue to the next part
        if (special == 1) {
            int countT = t.length();
            int countS = 0;

            // Count how many times the first character of t appears in s
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == t.charAt(0)) {
                    countS++;
                }
            }

            // If the number of occurrences of the first character in s is less than in t, print "YES"
            if (countS < countT) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}