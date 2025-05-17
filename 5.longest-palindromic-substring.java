/*
 * @lc app=leetcode id=5 lang=java
 *
 * [5] Longest Palindromic Substring
 */

// @lc code=start
class Solution {
    public String reverse(String s) {
        StringBuilder string = new StringBuilder(s);
        string.reverse();
        return string.toString();
    }
    public boolean palindrome(String s){
        int strlen = s.length();
        if(strlen == 0){
            return false;
        }
        if(strlen==1){
            return true;
        }
        if(strlen%2==1){
            String sub = s.substring(0,(strlen/2)+1);
            String string = reverse(s.substring(strlen/2, strlen));
            if(sub.equals(string)){
                return true;
            }
        } else {
            String sub = s.substring(0, (strlen/2));
            String string = reverse(s.substring((strlen/2), strlen));
            if(sub.equals(string)){
                return true;
            }

        }
        return false;

    }
    public String longestPalindrome(String s) {
        if(s==null) return "";
        if(s.length()<1) return "";
        int length = 0;
        String ans = s;
        for(int i=0; i<s.length(); i++){
            for(int j=i+1; j<=s.length(); j++){
                if(palindrome(s.substring(i,j))){
                    if(s.substring(i,j).length()>length){
                        length=s.substring(i,j).length();
                        ans = s.substring(i,j);
                    }
                }
            }
        }
        return ans;
    }
}
// @lc code=end

