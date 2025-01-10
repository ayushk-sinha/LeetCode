import java.util.*;

class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        List<String> ans = new ArrayList<>();
        int[] maxFreq = new int[26];

        // Calculate maximum frequency of each character across all words in words2
        for (String b : words2) {
            int[] bFreq = getCharFrequency(b);
            for (int i = 0; i < 26; i++) {
                maxFreq[i] = Math.max(maxFreq[i], bFreq[i]);
            }
        }

        // Check each word in words1 if it satisfies the maximum frequency requirement
        for (String a : words1) {
            int[] aFreq = getCharFrequency(a);
            if (isSubset(aFreq, maxFreq)) {
                ans.add(a);
            }
        }

        return ans;
    }

    // Helper function to calculate character frequency
    private int[] getCharFrequency(String word) {
        int[] freq = new int[26];
        for (char c : word.toCharArray()) {
            freq[c - 'a']++;
        }
        return freq;
    }

    // Helper function to check if freqA covers all requirements of freqB
    private boolean isSubset(int[] freqA, int[] freqB) {
        for (int i = 0; i < 26; i++) {
            if (freqA[i] < freqB[i]) {
                return false;
            }
        }
        return true;
    }
}
