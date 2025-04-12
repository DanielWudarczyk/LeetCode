class Solution {
public:
    void reverse(vector<int>& nums, int left, int right){
        while(left<right){
            swap(nums[left], nums[right]);
            left++;
            right--;
        }
    }

    void rotate(vector<int>& nums, int k) {
        if (nums.size()<2 || k==0) return;
        k%=nums.size();
        reverse(nums, 0, nums.size()-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, nums.size()-1);
    }
};