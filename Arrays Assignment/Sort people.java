class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int l1=names.length;
        int l2=heights.length;
        int temp;
        String str;
        for(int i=0;i<l2;i++){
            for(int j=i+1;j<l2;j++){
                if(heights[i]<heights[j]){
                    temp=heights[i];
                    heights[i]=heights[j];
                    heights[j]=temp;
                    str=names[i];
                    names[i]=names[j];
                    names[j]=str;
                }

            }
        }
        return names;
    }
}
