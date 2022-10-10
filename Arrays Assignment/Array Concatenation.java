class Solution {
    public int[] getConcatenation(int[] nums) {
        int len=nums.length;
        int arr[]=new int[2*len];
        int k=0;
        for(int i=0;i<len;i++){
            arr[k++]=nums[i];
        }
        for(int i=0;i<len;i++){
            arr[k++]=nums[i];
        }
        return arr;
    }
}
