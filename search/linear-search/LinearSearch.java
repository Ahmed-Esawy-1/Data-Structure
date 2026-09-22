public class LinearSearch {
    public static void main(String[] args) {

        int nums[]= {1,2,3,5,7,9,10,11,13};
        int target = 15;
        int result = linearSearch(nums, target);

        if(result != -1) {
			System.out.println("Element found at index: "+ result);
        }
		else {
			System.out.println("Element not found");
        }

    }

    public static int linearSearch(int numbers[], int target) {
        for(int i=0; i < numbers.length; i++) {
            if(numbers[i] == target) 
                return i;
        }
        return -1;
    }
}
