package java;

class Solution {
    public int searchInsert(int[] nums, int target) {
        int max = nums.length - 1;
        int min = 0;
        while(min <= max){
            int midpoint = min + (max-min)/2;
            if(nums[midpoint] == target){
                return midpoint;
            }
            if(nums[midpoint] > target){
                max = midpoint - 1;
                midpoint = (max - min)/2;
            }
            else{
                min = midpoint + 1;
                midpoint = (max-min/2);
            }
        }
        return min;
    }
}
