class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        int ctr=0;
        for(;left<right;){
            left=left>>1;
            right=right>>1;
            ctr++;
            
        }
        return left<<ctr;
    }
}
