class Solution {
    public boolean canJump(int[] nums) {
        int i=0;
        int max_index=0;
        do{
            if(max_index<i+nums[i]){
                max_index=i+nums[i];
            }
            if(max_index>=nums.length-1){
                return true;
            }
            i++;
        } while(i<=max_index);
        return false;
    }
}