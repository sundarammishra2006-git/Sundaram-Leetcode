class Solution {
    public boolean checkRecord(String s) {
        return s.indexOf("LLL") == -1 && countA(s) < 2;
    }

    private int countA(String s) {
        int count = 0;

        for (char ch : s.toCharArray()) {
            if (ch == 'A') {
                count++;
            }
        }

        return count;
    }
}
