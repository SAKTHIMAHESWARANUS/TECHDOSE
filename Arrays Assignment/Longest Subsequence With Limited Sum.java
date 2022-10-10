class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        int m=queries.length;
        Arrays.sort(nums);
        int len=nums.length;
        int crr[]=new int[m];
        for(int i=0;i<m;i++){
            int sm=queries[i],mx=0;
            for(int j=0;j<len;j++){
                sm-=nums[j];
                mx++;
                if(sm<0){
                    sm+=nums[j];
                    mx--;
                }
            }
            crr[i]=mx;
        }
        return crr;
        
        
    }
}
