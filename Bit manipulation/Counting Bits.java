class Solution {
    public int solve(int i){
        if(i==0) {
            return 0;}
        else if(i==1) {
            return 1;}
        else{
            if(i%2==0){
                return solve(i/2);
            }
            else{
                return 1+solve(i/2); 
            }
        }
    }
    public int[] countBits(int n) {
        int res []=new int [n+1];
        for(int i=0;i<=n;i++){
            res[i]=solve(i);
        }
        return res;
    }
    
}
