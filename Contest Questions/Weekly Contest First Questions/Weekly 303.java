class Solution {
    public char repeatedCharacter(String s) {
    Set<Character> myset=new HashSet<>();
    char ch='a';
    for(int i=0;i<s.length();i++){
        ch=s.charAt(i);
        if(myset.contains(ch)){
            return ch;
        }
        else{
            myset.add(ch);
        }
    }
    return ch;
    }
}
