class Solution {
     int missingNum(int arr[]) {
        int n = arr.length + 1;
        long sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        long total = (long) n * (n + 1) / 2;
        return (int)(total - sum);
    }
}