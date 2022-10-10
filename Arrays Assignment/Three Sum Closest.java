class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int len=nums.length;
        int sum=0;
        int diff=Integer.MAX_VALUE;
        Arrays.sort(nums);
        for(int i=0;i<len;i++){
            int p1=i+1;
            int p2=len-1;
            
            while(p1<p2){
                sum=nums[i]+nums[p1]+nums[p2];
                
                if(Math.abs(sum-target)<Math.abs(target-diff)){
                    diff=sum;                }
                else if(sum>target){
                    p2--;
                }
                else{
                    p1++;
                }
            }
        }
        return diff;
    }
}
