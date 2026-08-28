class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null || strs.length == 0){
            return null;
        }
        int[] nums = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,101,103};
            Map<Long,List<String>> map = new HashMap<>();
            for(String word : strs){
                long prod = 1l;
                for(int i=0 ; i<word.length(); i++){
                    prod *= nums[word.charAt(i) - 'a'];
                }
                if(map.containsKey(prod)){
                    map.get(prod).add(word);
                }
                else{
                    map.put(prod,new ArrayList<>());
                    map.get(prod).add(word);
                }
            }

           List<List<String>> result = new ArrayList<>();
           for(List<String> list : map.values()){
            result.add(list);
           }

           return result;
        
    }
}
