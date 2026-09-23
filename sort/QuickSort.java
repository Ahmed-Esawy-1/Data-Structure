public class QuickSort {
    public static void main(String[] args) {

        int nums[] = { 5, 3, 4, 8, 2 };

        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println("<- Before Sorting");

        nums = quickSort(nums, 0, nums.length - 1);

        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println("<- After Sorting");
    }

    // ---- FUNCTION
    public static int[] quickSort(int arr[], int low, int high) {
        if (low < high) {

            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
        return arr;
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }
}
