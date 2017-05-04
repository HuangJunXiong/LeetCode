public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int length = 0;
        Set<Character> set = new HashSet<Character>();
        char[] ch = s.toCharArray();
        int j = 0;
        for(int i = 0; i<ch.length; i++){
            if(!set.contains(ch[i])){
                set.add(ch[i]);
                length = set.size()>length?set.size():length;
            }else{
                i--;
                set.remove(ch[j++]);
            }
        }
        return length;
    }
}