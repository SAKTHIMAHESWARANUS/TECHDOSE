class Solution {
    public int maximumWealth(int[][] mat) {
        int r=mat.length;
        int c=mat[0].length;
        int maxsum=0;
        for(int i=0;i<r;i++){
            int csum=0;
            for(int j=0;j<c;j++){
                csum+=mat[i][j];
            }
            if(csum>maxsum){
                maxsum=csum;
            }
        }
        return maxsum;
    }
}
