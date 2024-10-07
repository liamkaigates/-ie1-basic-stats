public class MinMaxCalculation {
    public static int[] main(int[] arr) {
        int[] minMax = { Integer.MAX_VALUE, Integer.MIN_VALUE };
        for (int i = 0; i < arr.length; i++) {
            if (minMax[0] > arr[i]) {
                minMax[0] = arr[i];
            } else if (minMax[1] < arr[i]) {
                minMax[1] = arr[i];
            }
        }
        return minMax;
    }
}