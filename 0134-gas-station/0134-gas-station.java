class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int gasValue=0,costValue=0;
        for(int x:gas) gasValue+=x;
        for(int x:cost) costValue+=x;
        if(gasValue<costValue) return -1;
        int ans=-1;
        int startGas=0,currGas=0;
        for(int i=0;i<gas.length;i++){
            currGas+=gas[i]-cost[i];
        if(currGas<0){
            startGas=i+1;
            currGas=0;
        }
    }
    return startGas;
    }
}