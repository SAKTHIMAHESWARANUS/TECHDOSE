class Solution {
    public int countKDifference(int[] nums, int k) {
        int len=nums.length;
        int ctr=0;
        for(int i=0;i<len;i++){
            for(int j=0;j<len;j++){
                if((Math.abs(nums[i]-nums[j]))==k){
                    ctr++;
                }
            }
        }
        return ctr/2;
    }
}
