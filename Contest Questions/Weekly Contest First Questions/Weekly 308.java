class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        int l1=nums.length;
        int l2=queries.length;
        Arrays.sort(nums);
        int arr[]=new int[l2];
        for(int i=0;i<l2;i++){
            int sum=0,j=0;
            for(j=0;j<l1;j++){
                if(sum+nums[j]>queries[i]){
                    arr[i]=j;
                    break;
                }
                sum=sum+nums[j];
            }
            if(j==l1) arr[i]=j;
        }
        return arr;
        
    }
}
