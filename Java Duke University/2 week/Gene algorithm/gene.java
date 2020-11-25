import java.util.*;
public class gene{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a gene code: ");
		String g = in.next();
		String geneCode = findSimpleGene(g);
		System.out.println(geneCode);
	}

	public static String findSimpleGene(String gene){
		String result = "";
		int start = gene.indexOf("ATG");
		int end = gene.indexOf("TAA", start + 3);
		int difference = end - start;
		if(start == -1)
			System.exit(1);
		else if(end == -1){
			return "";
		}
		else{
			if(difference % 3 == 0)
				result += gene.substring(start, end+3);
			else
				System.out.println("Gene code isn't correct");
		}
		return result;
	}
}