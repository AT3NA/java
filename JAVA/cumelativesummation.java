public class cumelativesummation{
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int[] cumulativeSum = new int[numbers.length];
        cumulativeSum[0] = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            cumulativeSum[i] = cumulativeSum[i - 1] + numbers[i];
        }
        System.out.println("Cumulative Sum:");
        for (int i = 0; i < cumulativeSum.length; i++) {
            System.out.print(cumulativeSum[i] + " ");
        }
    }
}
