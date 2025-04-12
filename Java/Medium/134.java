class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalTank=0, currTank=0, startIndex=0;
        for(int i=0; i<gas.length; i++){
            int balance=gas[i]-cost[i];
            totalTank+=balance;
            currTank+=balance;
            if(currTank<0){
                startIndex=i+1;
                currTank=0;
            }
        }
        if(totalTank>=0){
            return startIndex;
        } else{
            return -1;
        }
    }
}