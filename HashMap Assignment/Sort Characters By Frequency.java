class Solution {
    public String frequencySort(String str) {
        String nstr="";
        int len=str.length();
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<len;i++){
            map.put(str.charAt(i),map.getOrDefault(str.charAt(i),0)+1);
        } 
         
         Set<Integer> myset=new LinkedHashSet<>();
        for(Map.Entry<Character,Integer> anme : map.entrySet()){
            myset.add(anme.getValue());
        }
        List<Integer> mylst=new ArrayList<>(myset);
        Collections.sort(mylst,Collections.reverseOrder());
        
        System.out.print(mylst);
        for(int i:mylst){
            for(Map.Entry<Character,Integer> ane : map.entrySet()){
               if(i==ane.getValue()) {
                   for(int k=0;k<i;k++){
                        nstr+=ane.getKey();
                   }
               }

            }
        }
         return nstr;
    }
}
