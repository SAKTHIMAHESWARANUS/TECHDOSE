class Solution {
    public int[] sortedSquares(int[] nums) {
        int len=nums.length;
        int []sq= new int [len];
        
        for(int i=0;i<len;i++){
            sq[i]=nums[i]*nums[i];
        }
        for(int i=0;i<len;i++){
            for(int j=i+1;j<len;j++){
                if(sq[i]>sq[j]){
                    int temp=sq[i];
                    sq[i]=sq[j];
                    sq[j]=temp;
                }
            }
        }
        
        return sq;
    }
}
