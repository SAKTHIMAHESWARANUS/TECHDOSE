class Solution {
    public int[][] largestLocal(int[][] grid) {
        int r=grid.length;
        int mat[][]=new int[r-2][r-2];
        for(int i=0;i<r-2;++i){
            for(int j=0;j<r-2;++j){
                int large=Integer.MIN_VALUE;
                for(int row=i;row<i+3;++row){
                    for(int col=j;col<j+3;++col){
                        large=Math.max(large,grid[row][col]);
                    }
                }
                mat[i][j]=large;
            }
        }
        return mat;
        
    }
}
