package java;

class Solution {
    public int[] getConcatenation(int[] nums) {
        int size = nums.length;
        int[] concat = new int[size * 2];
        for(int i = 0; i < size; i++){
            concat[i] = nums[i];
            concat[i+size] = nums[i];
        }
        return concat;
    }
}
