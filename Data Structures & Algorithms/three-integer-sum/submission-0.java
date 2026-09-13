class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if(nums.length == 1 || nums == null){
            return result;
        }
        

        //step1 => sort the array for avoid duplicate triplets
        Arrays.sort(nums);

        //step2 => map the elements (key -> nums element , value -> index)
        Map<Integer,Integer> map = new HashMap<>();
      for(int i=0 ; i<nums.length ; i++){
        map.put(nums[i],i);
      }

        //step3 => set
        Set<String> used = new HashSet<>();
        for(int i=0 ; i<nums.length ; i++){
            for(int j=i+1 ; j<nums.length ; j++){
                int currSum = nums[i]+nums[j];
                if(map.containsKey(-1*currSum)){
                    int k = map.get(-1*currSum);
                    if(!used.contains(nums[i]+":"+nums[j]+":"+nums[k]) && k>i && k>j){
                        result.add(Arrays.asList(nums[i],nums[j],nums[k]));
                        used.add(nums[i]+":"+nums[j]+":"+nums[k]);
                    }


                   
                }
            }
        }

      return result;
        
    }
}
