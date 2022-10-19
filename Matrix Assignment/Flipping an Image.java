class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int row=image.length;
        int col=image[0].length;
        int mat[][] =new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=col-1;j>=0;j--){
                mat[i][col-j-1]=image[i][j];
            }
        }
        
            



       for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(mat[i][j]==1){
                    mat[i][j]=0;
                }
                else if(mat[i][j]==0){
                    mat[i][j]=1;
                }
            }
        }
    return mat;
    }

}
