import java.util.*;

public class hackerrank{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int year = in.nextInt();

		int[] arr = new int[year];
		int max = arr[0];
		int counter = 0;

		for(int i = 0 ; i < year; i++){
			arr[i] = in.nextInt();
		}

		for(int i = 0 ; i < year; i++){
			if(arr[i] > max)
				max = arr[i];
		}

		for(int i = 0 ; i < year; i++){
			if(arr[i] == max)
				counter++;
		}

		System.out.println(counter);
	}
}