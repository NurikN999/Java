//package from Duke University
import edu.duke.FileResource;
import java.util.*;
public class packageTest{
	public void runHello(){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a file name: ");
		String nameOfFile = in.next();
		FileResource f = new FileResource(nameOfFile);
		for(String line : f.lines()){
			System.out.println(i + ". " + line);
		}
	}
	public static void main(String[] args) {
		packageTest hw = new packageTest();
		hw.runHello();
	}
}