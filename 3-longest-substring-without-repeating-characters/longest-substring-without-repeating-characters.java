class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character>set=new HashSet<>();
        int l = 0;
        int m = 0;
        for(int r =0;r<s.length();r++){
            while(set.contains(s.charAt(r))){
                set.remove(s.charAt(l));
                l=l+1;
            }
            set.add(s.charAt(r));
            m=Math.max(m,r-l+1);
        }
        return m;
    }//common
}