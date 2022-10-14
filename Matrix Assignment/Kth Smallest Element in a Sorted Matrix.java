class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int r=matrix.length;
        int c=matrix[0].length;
        if(r==1 && c==1) return matrix[0][0];
        List<Integer> mylst=new ArrayList<>();
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                mylst.add(matrix[i][j]);
            }
        }
        Collections.sort(mylst);
        for(int i:mylst){
            System.out.print(i+" ");
        }
        return mylst.get(k-1);
        
    }
}
