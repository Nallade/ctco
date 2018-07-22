package solvita;

public class Exercise1 {
    public static int solution(int[] array) {
        int countNumbers = 1;
        int max = Integer.MIN_VALUE;
        int result = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == array[i + 1]) {
                countNumbers = countNumbers + 1;
                if (countNumbers > max) {
                    max = countNumbers;
                    result = array[i];
                }
            } else {
                countNumbers = 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] intArray = new int[]{1, 5, 5, 5, 6, 6, 7, 7, 7, 7, 7, 7, 7, 7, 5, 5, 5, 5, 5};
        int result = solution(intArray);
        System.out.println(result);
    }
}
