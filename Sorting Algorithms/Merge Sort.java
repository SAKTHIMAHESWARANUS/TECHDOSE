class Solution {
    public int[] merge(int left[],int right[]){
        int mix[]=new int[left.length+right.length];
        int i=0,j=0,k=0;
        while(i<left.length && j<right.length){
            if(left[i]<right[j]){
                mix[k]=left[i];
                i++;
            }
            else{
                mix[k]=right[j];
                j++;
            }
            k++;
        }
        while(i<left.length){
            mix[k++]=left[i];
            i++;
        }
        while(j<right.length){
            mix[k++]=right[j];
            j++;
        }
        return mix;
    }
    public int[] mergesort(int [] arr){
        if(arr.length==1){
            return arr;
        }
        int mid=arr.length/2;
        int left[]=mergesort(Arrays.copyOfRange(arr,0,mid));
        int right[]=mergesort(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(left,right);

    }
    public int[] sortArray(int[] nums) {
        return mergesort(nums);
    }
}
