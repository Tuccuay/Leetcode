public class Main {

    public static void main(String[] args) {
        Solution solution = new Solution();
        String str = "abcabcabc";
        System.out.print(solution.repeatedSubstringPattern(str));
    }
}

class Solution {
    boolean repeatedSubstringPattern(String str) {
        String ss = str + str;
        String sssub = ss.substring(1, ss.length() - 1);
        return sssub.contains(str);
    }
}