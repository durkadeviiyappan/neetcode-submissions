class Solution {
    public int[] countBits(int n) {
        int[] result = new int[n+1];
        result[0] = 0;
       
     for(int i=1 ; i<=n ; i++){
        int temp = i;
        int count = 0;
       
       while(temp > 0){
           if((temp&1) != 0){
            count++;
           }
            temp = temp>>1;
       }
       result[i] = count;
     }
     return result;
    }
}
