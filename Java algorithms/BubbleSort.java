/*
This is implementation of BubbleSort. Time complexity is O(n^2)
*/
import java.util.*;
public class BubbleSort{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i <n ; i++) {
			int a = in.nextInt();
			arr[i] = a;
		}
		printArray(sortArray(arr));
	}

	public static int[] sortArray(int[] arr){
		for (int i = 0; i <arr.length - 1; i++) {
			if(arr[i] > arr[i + 1]){
				int temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = temp;
			}
		}
		return arr;
	}

	public static void printArray(int[] arr){
		for (int i = 0; i <arr.length ; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}