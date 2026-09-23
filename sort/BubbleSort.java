public class BubbleSort {
    public static void main(String[] args) {

        int nums[] = { 5, 3, 4, 8, 2 };

        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println("<- Before Sorting");

        nums = bubbleSort(nums);

        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println("<- After Sorting");
    }

    // ---- FUNCTION
    public static int[] bubbleSort(int arr[]) {
        int size = arr.length;
        int temp = 0;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        return arr;
    }
}