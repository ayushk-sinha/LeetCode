import java.util.HashSet;
import java.util.Set;

class Pair {
    int firstOcc;
    int secondOcc;

    Pair(int firstOcc, int secondOcc) {
        this.firstOcc = firstOcc;
        this.secondOcc = secondOcc;
    }
}

class Solution {
    public int countPalindromicSubsequence(String s) {
        int ans = 0;

        // Create a Pair array to store the first and last occurrence of each character
        Pair[] arr = new Pair[26];
        for (int i = 0; i < 26; i++) {
            arr[i] = new Pair(-1, -1);
        }

        // Populate the first and last occurrence for each character
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int index = c - 'a';
            if (arr[index].firstOcc == -1) {
                arr[index].firstOcc = i;
            } else {
                arr[index].secondOcc = i;
            }
        }

        // Traverse the Pair array to find valid ranges and count unique characters
        for (Pair p : arr) {
            if (p.secondOcc > p.firstOcc) {
                int i = p.firstOcc;
                int j = p.secondOcc;

                Set<Character> charSet = new HashSet<>();
                for (int x = i + 1; x < j; x++) {
                    charSet.add(s.charAt(x));
                }

                ans += charSet.size();
            }
        }

        return ans;
    }

    // public static void main(String[] args) {
    //     Solution solution = new Solution();
    //     String s = "aabca";
    //     System.out.println("Count of Palindromic Subsequences: " + solution.countPalindromicSubsequence(s)); // Output: 3
    // }
}
