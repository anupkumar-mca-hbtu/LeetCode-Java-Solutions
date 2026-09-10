class Solution {
    public int characterReplacement(String s, int k) {
        int[] freqArr = new int[26];  
        int left = 0;
        int maxFreq = 0;
        int ans = 0;

        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);
            freqArr[ch - 'A']++;
            maxFreq = Math.max(maxFreq, freqArr[ch - 'A']);

           
            while ((right - left + 1) - maxFreq > k) {
                freqArr[s.charAt(left) - 'A']--;
                left++;
            }

            ans = Math.max(ans, right - left + 1);
        }

        return ans;
    }
}