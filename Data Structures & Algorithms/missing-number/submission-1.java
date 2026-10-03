class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0;
        for(int n : nums){
            sum += n;
        }
        int last = nums.length;
        int originalSum = (last*(last+1))/2 ;
        return originalSum-sum;
    }
}
