class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        int i = 0;
        int j = n-1;
        while(true){
            int sum = numbers[i]+numbers[j];
            if(sum == target){
                return new int[] {i+1, j+1};
            }
            int m = (i+j)/2;
            if(sum<target){
                if(numbers[m]+numbers[j]<=target){
                    i=m;
                } else{
                    i++;
                }
            } else{
                if(numbers[i]+numbers[m]>=target){
                    j=m;
                } else{
                    j--;
                }
            }
        }
    }
}