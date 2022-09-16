class Solution {
    public int hammingDistance(int x, int y) {
        int res=x^y,ctr=0;
        while(res>0){
            ctr+= res&1;
            res>>=1;
        }
        return ctr;
    }
}
