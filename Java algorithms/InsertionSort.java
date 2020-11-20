/*
This is implementation of insertion sort in java. Time complexity is O(n) 
*/
import java.util.*;
public class InsertionSort{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++){
			arr[i] = in.nextInt();
		}
		printArr(InsertionSort(arr));
	}

	public static int[] InsertionSort(int[] arr){
		for(int i = 1; i < arr.length; i++){
			int current = arr[i];
			int j = i - 1;

			while(j >= 0 && current < arr[j]){
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j+1] = current;
		}
		return arr;
	}

	public static void printArr(int[] arr){
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
	}
}