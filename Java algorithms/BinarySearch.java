
public class BinarySearch {
	public static void main(String[] args) {
		int[] arr = {2,1,3,4,5,7};
		bubbleSort(arr);
		binarySearch(arr,5);
	}
	
	//sorting array
	public static int[] bubbleSort(int[] arr){
		for(int i = 0; i < arr.length - 1; i++) {
			if(arr[i] > arr[i + 1]) {
				int temp = arr[i + 1];
				arr[i + 1] = arr[i];
				arr[i] = temp;
			}
		}
		return arr;
	}
	
	//binary search
	public static int binarySearch(int[] arr, int target) {
		int low = 0;
		int high = arr.length - 1;
		while(low <= high) {
			int mid = (low + high) / 2;
			int guess = arr[mid];
			if(guess == target) {
				return guess;
			}
			
			if(guess > target) {
				high = mid - 1;
			}else
				low = mid + 1;
		}
		return 0;
	}
}
