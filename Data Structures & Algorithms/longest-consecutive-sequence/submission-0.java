class Solution {
    public int longestConsecutive(int[] nums) {
        Map<Integer,Boolean> exploredMap = new HashMap<>();

        //put all elements into the map and mark those values to false
        for(int num : nums){
            exploredMap.put(num,false);   //autoboxing happen here (java automatically convert primitive data type into wrapper class)
  }

  int largest = 0;

 
    for(int num : nums){
        int currentLargest = 1;

        // do  check the consequtive elements present in forward direction
        int nextNum = num+1;
        while(exploredMap.containsKey(nextNum) && exploredMap.get(nextNum)==false){
            currentLargest++;
            exploredMap.put(nextNum , true);
            nextNum++;
        }

        //do check the consequtive elements present in reverse direction
        int prevNum = num-1;
        while(exploredMap.containsKey(prevNum) && exploredMap.get(prevNum)==false){
            currentLargest++;
            exploredMap.put(prevNum , true);
            prevNum--;
        } 

        largest = Math.max(largest , currentLargest);
        
    }

     return largest;

    }

    
}
