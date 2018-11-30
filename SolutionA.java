/*
Basic binary search is modified to suit the requirments.Index of the mid number is compared against the value 
and if index is greater then value then left side of the array is discarded else right side of array is discarded.
search is repeated untill all the elements are compared to find the rightmost value which is equal to it's index.
*/
import java.util.Scanner;
public class SolutionA {
    public static void main(String[] args) {
        //Read the input
        Scanner input = new Scanner(System.in);
        int count = input.nextInt();
        int[] array = new int[count + 1];
        //save the values in array starting at index 1
        for (int i = 1; i <= count; i++) {
            array[i] = input.nextInt();
        }
        int result = binarySearch(array);
        if (result == 0) {
            System.out.println("NOT_FOUND");
        } else {
            System.out.println(result);
        }
    }

    public static int binarySearch(int[] inputArr) {
        int start = 1; //starting index
        int resultIndex = 0; //to save the result index and 0 represents not found
        int end = inputArr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (mid == inputArr[mid]) {
                if (mid < resultIndex || resultIndex == 0) { //to find the right most correct number mid number is compared with index              
                    resultIndex = mid;
                }
            }
            if (mid > inputArr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return resultIndex;
    }
}
