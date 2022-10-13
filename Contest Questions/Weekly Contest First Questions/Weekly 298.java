class Solution {
    public String greatestLetter(String s) {
        Set<Character> mylst=new HashSet<>();
        for(char ch: s.toCharArray()){
            mylst.add(ch);
        }
        for(char ch='Z';ch>='A';ch--){
            if(mylst.contains(ch) && mylst.contains((char)('a'+(ch-'A')))){
                return ""+ch;
            }
        }
        return "";
    }
}
