class Solution {
    public int jump(int[] nums) {
        int furthest=0;
        int jumps=0;
        int currentEnd=0;
        for(int i=0; i<nums.length-1; i++){
            if(i+nums[i]>furthest){
                furthest=i+nums[i];
            }
            if(i==currentEnd)
            {
                jumps++;
                currentEnd=furthest;
                if(currentEnd>=nums.length-1)
                {
                    break;
                }
            }
        }
        return jumps;
    }
}