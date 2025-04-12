class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int price_of_buying=prices[0];
        int profit=0;
        for(size_t i=1; i<prices.size(); i++){
            if(prices[i]<prices[i-1]){
                profit+=prices[i-1]-price_of_buying;
                price_of_buying=prices[i];
            }
            else if(i==prices.size()-1){
                profit+=prices[i]-price_of_buying;
            }
        }
        return profit;
    }
};