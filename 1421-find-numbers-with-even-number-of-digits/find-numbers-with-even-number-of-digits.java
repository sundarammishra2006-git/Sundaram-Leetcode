class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int num : nums){
            if(digitCount(num) % 2 == 0){
                count++;
            }
        }
        return count;
    }
    private int digitCount(int num){
        int digits = 0;
        while(num > 0){
            digits++;
             num /= 10;

        }
        return digits;
    }
}