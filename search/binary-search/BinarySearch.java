public class BinarySearch {
    public static void main(String[] args) {
    
        int nums[]= {1,2,3,5,7,9,10,11,13};
        int target = 3;
        int result1 = binarySearch(nums, target);
        int result2 = binarySearch(nums, target, 0, nums.length-1);
    
            if(result1 != -1) {
                System.out.println("Element found at index: "+ result1);
            }
            else {
                System.out.println("Element not found");
            }

            if(result2 != -1) {
                System.out.println("Element found at index: "+ result2);
            }
            else {
                System.out.println("Element not found");
            }
    
    }
    
        public static int binarySearch(int numbers[], int target) {
            int size = numbers.length;
            int left = 0;
            int right = size - 1;

            while (left <= right) {
                int mid = (left + right) / 2;

                if(numbers[mid] == target) {
                    return mid;
                } else if(numbers[mid] < target) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }

            return -1;
        }

        // Binary Recursive Function
        public static int binarySearch(int[] nums, int target, int left, int right) {	
            if(left<=right) {
                int mid=(left+ right)/2;

                if(nums[mid] == target)
                    return mid;
                else if(nums[mid] < target) 
                    return binarySearch(nums, target, mid+1, right);
                else
                    return binarySearch(nums, target, left, mid-1);
            }
            return -1;
        }
    
    
}
