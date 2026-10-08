class Solution {
    public String removeKdigits(String num, int k) {
        if (k >= num.length()) return "0";

        StringBuilder sb = new StringBuilder();

        for (int idx = 0; idx < num.length(); idx++) {
            char c = num.charAt(idx);
            while (k > 0 && sb.length() > 0 && sb.charAt(sb.length() - 1) > c) {
                sb.deleteCharAt(sb.length() - 1);
                k--;
            }
            sb.append(c);
        }

        sb.setLength(sb.length() - k);

        int j = 0;
        while (j < sb.length() && sb.charAt(j) == '0') j++;

        String res = sb.substring(j);
        return res.isEmpty() ? "0" : res;
    }
}