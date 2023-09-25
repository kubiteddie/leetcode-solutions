package java;

class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        int n = s.length() - 1;
        int scan = 0;
        
        
        while(n >= 0 && s.charAt(n) != ' '){
            scan++;
            n--;
        }
        return scan;
    }
}
