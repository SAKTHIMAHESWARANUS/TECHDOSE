class Solution {
    public int GCD(int a,int b){
        if(b==0) return a;
        else return GCD(b,a%b);
    }
    public int findGCD(int[] nums) {
       int len=nums.length;
       Arrays.sort(nums);
       return GCD(nums[0],nums[len-1]); 
    }
}
