class Solution {
    public void duplicateZeros(int[] arr) {
        int n = arr.length;
        List<Integer> list = new ArrayList<>();

        for (int num : arr) {
            list.add(num);

            if (num == 0) {
                list.add(0);
            }
        }

        for (int i = 0; i < n; i++) {
            arr[i] = list.get(i);
        }
    }
}