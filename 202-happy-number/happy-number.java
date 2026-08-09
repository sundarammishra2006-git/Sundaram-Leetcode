class Solution {
    public boolean isHappy(int n) {
        int org = n;
        int sum = 0;
        while(n > 0){
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }

        if(sum == 1 || sum == 7){
            return true;
        }
        else if(sum == 0 || sum == 2 ||sum == 3 || sum == 4 ||sum == 5 || sum == 6 ||sum == 8 || sum == 9 ){
            return false;
        }
        else if(sum == org){
            return false;
        }
        else{
            return isHappy(sum);
        }
    }
}