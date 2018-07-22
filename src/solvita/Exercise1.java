package solvita;

public class Exercise1 {
    public static int solution(int[] array) {
        int countNumbers = 1;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == array[i + 1]) {
                countNumbers = countNumbers + 1;
                if (countNumbers > max) {
                    max = countNumbers;
                }
                System.out.println(i + "-th element (" + array[i] + ") is equal to " + (i + 1) + "-th element  (" + array[i + 1] + ") and we have " + countNumbers + " numbers");
            } else {
                countNumbers = 1;
                System.out.println(i + "-th element (" + array[i] + ") is NOT equal to " + (i + 1) + "-th element (" + array[i + 1] + ") and we had " + countNumbers + " numbers");

            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] intArray = new int[]{1, 5, 5, 5, 6, 6, 7, 7, 7, 7, 7, 7, 7, 7, 5, 5, 5, 5, 5};
        int result = solution(intArray);
        System.out.print(result);
    }
}
