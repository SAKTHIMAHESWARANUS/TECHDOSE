class Solution {
    public String[] sortPeople(String[] names, int[] arr) {
        int len=arr.length;
        String ctr;
        for(int i=0;i<len;i++){
            for(int j=i+1;j<len;j++){
                if(arr[i]<arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    ctr=names[i];
                    names[i]=names[j];
                    names[j]=ctr;
                        
                }
            }
        }
        return names;
    }
}
