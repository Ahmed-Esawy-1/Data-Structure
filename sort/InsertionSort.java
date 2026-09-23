public class InsertionSort {
    public static void main(String[] args) {

        int nums[] = { 5, 3, 4, 8, 2 };

        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println("<- Before Sorting");

        nums = insertionSort(nums);

        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println("<- After Sorting");
    }

    // ---- FUNCTION
    public static int[] insertionSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        return arr;
    }
}