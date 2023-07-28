public class BubbleSort {

    public static void bubble_Sort(int[] arr, int len) {

        for (int i = 0; i < len - 1; ++i) {

            for (int j = 0; j < len - i - 1; ++j) {

                if (arr[j + 1] < arr[j]) {

                    int swap = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = swap;

                }
            }
        }
    }

    public static void main(String args[]) {
        int[] arr = { 10, 7, 99, 54,6526,992,88,91, 2, 33, 55, 7, 1, 2, 222, 232 };
        int len = arr.length;
        bubble_Sort(arr, len);

        for (int i = 0; i < len; ++i) {
            System.out.print(arr[i] + " ");
        }
    }
}