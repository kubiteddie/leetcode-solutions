package java;

class Solution {
    public int strStr(String haystack, String needle) {
        int index = 0;
        while(index + needle.length() < haystack.length() && !haystack.substring(index, index + needle.length()).equals(needle)){
            index++;
        }
        if(needle.length() > haystack.length() || !haystack.substring(index, index+needle.length()).equals(needle)){
            index = -1;
        }
        return index;
    }
}
