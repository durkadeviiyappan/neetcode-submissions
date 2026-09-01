class Solution {

    public String encode(List<String> strs) {
       String res = "";
        for(String s : strs){
            res += s.length() + "#" + s;
        }
        return res;

    }

    public List<String> decode(String str) {
           List<String> result = new ArrayList<>();
           int i = 0 ; // point out the starting of encoded String
            while(i < str.length()){
               int j=i ; //point out the delimiter 
               while(str.charAt(j) != '#'){
                j++;
               }

               //to extract the length
               int length = Integer.parseInt(str.substring(i,j));

               //to extract the word and add into the result list
               result.add( str.substring(j+1 , j+1+length));

               //update the i value
                i = j+1+length;
               
           }
           return result;
    }
}
