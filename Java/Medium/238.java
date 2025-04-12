class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] answer=new int[n];
        answer[0]=1;
        for(int i=1; i<n; i++){
            answer[i]=answer[i-1]*nums[i-1];
        }
        int m=nums[n-1];
        for(int i=n-2; i>=0; i--){
            answer[i]=answer[i]*m;
            m*=nums[i];
        }
        return answer;
    }
}