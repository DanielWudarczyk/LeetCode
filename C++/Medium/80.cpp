class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        if (nums.empty()) return 0;
        else if(nums.size()<3){
            return nums.size();
        }
        else{
            int k=2;
            for(size_t i=2; i<nums.size(); i++){
                if (nums[i]!=nums[k-2]){
                    nums[k]=nums[i];
                    k++;
                }
            }
            return k;
        }
    }
};