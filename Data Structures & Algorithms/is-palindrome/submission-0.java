class Solution {
    public boolean isPalindrome(String s) {
        //step1 (remove non-alphanumeric character)
        String result = "";
        for(int i=0 ; i<s.length() ; i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                 result += Character.toLowerCase(s.charAt(i));
            }
        }
         int start = 0;
         int end = result.length()-1;
         while(start < end){
            if(result.charAt(start) != result.charAt(end)){
                return false;
            }
            start++;
            end--;
         }
         return true;

        
    }
}
