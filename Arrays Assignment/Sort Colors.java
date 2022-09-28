class Solution {
    public void sortColors(int[] nums) {
        int len=nums.length;
        int z=0,f=0,s=0;
        for(int i=0;i<len;i++){
            if(nums[i]==0) z++;
            else if(nums[i]==1) f++;
            else if(nums[i]==2) s++;
        }
        int index=0;
        while((z--) > 0) nums[index++]=0;
        while((f--) > 0) nums[index++]=1;
        while((s--) > 0) nums[index++]=2;
        
    }
}
