class Solution {
    public int maxProductDifference(int[] arr) {
        int len=arr.length;
        Arrays.sort(arr);
        return (arr[len-1]*arr[len-2])-(arr[0]*arr[1]);
       }
}
