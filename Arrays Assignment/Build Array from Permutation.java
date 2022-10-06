class Solution {
    public int[] buildArray(int[] nums) {
        int len=nums.length;
        int arr[]=new int [len];
        int k=0;
        for(int i=0;i<len;i++){
            arr[k++]=nums[nums[i]];
        }
        return arr;
    }
}
