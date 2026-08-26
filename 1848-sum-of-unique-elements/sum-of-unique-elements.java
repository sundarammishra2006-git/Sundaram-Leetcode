class Solution {
    public int sumOfUnique(int[] nums) {
      int[] result = new int[101];
      for(int num: nums){
        result[num]++;
      }
        int sum = 0;
        for(int i = 1; i<= 100; i++){
            if(result[i] == 1){
                sum += i; 
            }
        }
        return sum;
      }  
    }
