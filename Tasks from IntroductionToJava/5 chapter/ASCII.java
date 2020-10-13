import java.util.*;
public class ASCII{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int NUMBER_PER_LINE = 10;
		int count = 0;
		for(int i = 33; i <= 126; i++){
			count++;
			char ch = (char)i;
			if(count % NUMBER_PER_LINE == 0)
				System.out.println(ch);		
			else
				System.out.print(ch + " ");
		}
		System.out.println();
	}
}