import java.util.*;
public class HighestScore{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number of students: ");
		int n = in.nextInt();
		int highestScore = 0;
		String highestScoreName = "";
		int count;
		int score;
		String name;
		for(count = 0; count < n; count++){
			name = in.next();
			score = in.nextInt();
			
			if(score > highestScore){
				highestScore = score;
				highestScoreName = name;
			}
		}
		System.out.println("Student with highrst score is " + highestScoreName + " with " + highestScore + " score");
	}
}