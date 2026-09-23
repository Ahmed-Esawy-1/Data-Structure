public class SelectionSort {
    public static void main(String[] args) {

        int nums[] = { 5, 3, 4, 8, 2 };

        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println("<- Before Sorting");

        nums = selectionSort(nums);

        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println("<- After Sorting");
    }

    // ---- FUNCTION
    public static int[] selectionSort(int arr[]) {
        int size = arr.length;
        int temp = 0;
        int minIndex = -1;

        for (int i = 0; i < size; i++) {
            minIndex = i;

            for (int j = i + 1; j < size; j++) {
                if (arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }

            temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

        return arr;
    }
}