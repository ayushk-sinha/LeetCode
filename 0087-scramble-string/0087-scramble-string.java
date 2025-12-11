class Solution {

    static Map<String, Boolean> memo = new HashMap<>();

    static boolean isScramble(String s1, String s2) {
        String S1 = s1;
        String S2 = s2;
        // If both strings are equal, it's trivially a scramble
        if (S1.equals(S2)) return true;

        // If lengths differ or characters mismatch, return false
        if (S1.length() != S2.length()) return false;

        int n = S1.length();
        if (n <= 1) return S1.equals(S2);

        // Memo check
        String key = S1 + "#" + S2;
        if (memo.containsKey(key)) return memo.get(key);

        // Optimization: if character count differs, no need to try splits
        if (!isAnagram(S1, S2)) {
            memo.put(key, false);
            return false;
        }

        boolean result = false;

        for (int i = 1; i < n; i++) {

            // Case 1: No swapping
            boolean noSwap =
                isScramble(S1.substring(0, i), S2.substring(0, i)) &&
                isScramble(S1.substring(i), S2.substring(i));

            // Case 2: Swapping
            boolean swap =
                isScramble(S1.substring(0, i), S2.substring(n - i)) &&
                isScramble(S1.substring(i), S2.substring(0, n - i));

            if (noSwap || swap) {
                result = true;
                break;
            }
        }

        memo.put(key, result);
        return result;
    }

    // Helper to check if two strings contain same characters
    static boolean isAnagram(String a, String b) {
        int[] freq = new int[26];
        for (char c : a.toCharArray()) freq[c - 'a']++;
        for (char c : b.toCharArray()) freq[c - 'a']--;
        for (int x : freq) if (x != 0) return false;
        return true;
    }
}
