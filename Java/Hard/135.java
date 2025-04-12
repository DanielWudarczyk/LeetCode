import java.util.Arrays;

class Solution {
    public int candy(int[] ratings) {
        int numOfCandies=0;
        int n=ratings.length;
        int[] nums=new int[n];
        Arrays.fill(nums, 1);

        for(int i=1; i<n; i++){
            if(ratings[i]>ratings[i-1]){
                nums[i]=nums[i-1]+1;
            }
        }

        for(int i=n-2; i>=0; i--){
            if(ratings[i]>ratings[i+1] && nums[i]<=nums[i+1]){
                nums[i]=nums[i+1]+1;
            }
        }

        for(int num:nums){
            numOfCandies+=num;
        }

        return numOfCandies;
    }
}