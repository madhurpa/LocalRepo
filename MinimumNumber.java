public class MinimumNumber {
    public static void main(String[] args) {
        int[] numbers;
        int min = numbers[0]; // Assuming the first element is the minimum initially
        numbers = {10, 5, 8, 20, 15};
        

        for (int i = 1; i < 10; i++) {
            if (numbers[i] < min) {
                min = numbers[i]; // Update min if a smaller number is found
                System.out.println("The minimum number is: " + min);
            }
        }

        System.out.println("The minimum number is: " + min);
    }
}