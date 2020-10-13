import java.util.*;
public class FactorsOfIntegers{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int index = 2;
		while(n / index != 1){
			if(n % index == 0){
				System.out.println(index + " ");
				n /= index;
			}
			else 
				index++;
		}
		System.out.println(n);
	}
}