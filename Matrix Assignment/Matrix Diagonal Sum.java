class Solution {
    public int diagonalSum(int[][] mat) {
        if(mat.length==1 && mat[0].length==1) return mat[0][0];
        int sum=0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(i==j){
                   sum+=mat[i][j];
                }
                if (i+j+1==mat.length && i!=j){
                    sum+=mat[i][j];
                    
                }
            }
        }
        return sum;
    }
}
