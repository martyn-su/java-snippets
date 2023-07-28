public class ArrayExample {
    public static void main(String[] args) {
        // Create an array of integers
        int[] numbers = {10, 20, 30, 40, 50};

        // Access elements using index
        System.out.println("First number: " + numbers[0]); // Output: 10
        System.out.println("Third number: " + numbers[2]); // Output: 30

        // Modify an element
        numbers[1] = 25;
        System.out.println("Modified second number: " + numbers[1]); // Output: 25

        // Calculate the sum of all elements
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("Sum of all numbers: " + sum); // Output: 155
    }
}
