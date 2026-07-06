public class sliding_window {
    public static int solve(int[] arr, int k) {
        int res = Integer.MIN_VALUE;
        int maxSum = 0;
        for (int i = 0; i < k; i++) {
            maxSum += arr[i];
        }
        res = Math.max(res, maxSum);
        for (int i = k; i < arr.length; i++) {
            maxSum += arr[i];
            maxSum -= arr[i - k];

            res = Math.max(res, maxSum);
        }
        return res;

    }

    public static void main(String[] args) {
        int[] arr = { 1, 5, 6, 7, 1, 2, 5 };

        System.out.println(solve(arr, 3));
    }
}