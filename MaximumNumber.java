public class MaximumNumber {
    public static void main(String[] args) {
        int[] numbers;
        int max = numbers[0]; // Assuming the first element is the maximum initially

        numbers = {10, 5, 8, 20, 15};

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i]; // Update max if a larger number is found
            }
        }

        System.out.println("The maximum number is: " + max);
    }
}