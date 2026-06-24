class Solution {
    public boolean canJump(int[] nums) {
       int n = nums.length;
       int good = n - 1;
       for(int i = n - 2; i >= 0; i--){
        if(i + nums[i] >= good) good = i;
       } 
       return good == 0;
    }
}
