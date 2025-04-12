import java.util.HashSet;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int left=0;
        int max=0;
        for(int right=0; right<s.length(); right++) {
            if(!set.contains(s.charAt(right)) && right-left+1>max) {
                max = right-left+1;
            }
            while(set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
        }
        return max;
    }
}