class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> grp=new HashMap<>();
        for(String str:strs){
            char []cstr=str.toCharArray();
            Arrays.sort(cstr);
            String sstr=String.valueOf(cstr);
            if(!grp.containsKey(sstr)){
                grp.put(sstr,new ArrayList<>());
            }
            grp.get(sstr).add(str);
        }
        return new ArrayList<> (grp.values());
    }
}
