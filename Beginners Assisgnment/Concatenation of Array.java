class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int y=n*2;
        int ctr[]=new int [y];
        int k=0;
        for(int i=0;i<2;i++){
            for(int j=0;j<n;j++){
                ctr[k++]=nums[j];
            }
        }
        return ctr;
        
    }
}
