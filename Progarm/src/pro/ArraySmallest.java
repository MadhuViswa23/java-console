package pro;
public class ArraySmallest {
    public static void main(String[] args) {
        int[] arr = {10, 5, 9, 1, 7}; 
        int smallest = arr[0];

      
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }

        System.out.println("Smallest number in the array: " + smallest);
    }
}
