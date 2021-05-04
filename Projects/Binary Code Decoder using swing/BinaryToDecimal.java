import javax.swing.*;

public class BinaryToDecimal {

	public static void main(String[] args) {
		
		//Input dialog message
		String code = JOptionPane.showInputDialog(null, 
												  "Enter binary code: " , 
												  "Binary to Decimal", 
												  JOptionPane.QUESTION_MESSAGE);
		
		//If user didn't entered any number, program will closed
		if(code == null){
			System.exit(1);
		}
		
		//We equalize our decoded binary code to "res" variable
		int res = decode(code);
		String text = "Вы ввели бинарный код: " + code + 
					  "\nКод соответсвует числу: " + res;
		
		//Just output the dialog message
		JOptionPane.showMessageDialog(null, 
									  text,
									  "Binary to Decimal",
									  JOptionPane.INFORMATION_MESSAGE);
		
	}
	
	public static int decode(String code) {
		int n = code.length();
		int k = 1, q = 1, s = 0, a;
		
		while(k <= n) {
			//Action counter
			
			//If character at (n-k) index is equal to 1, a = 1  
			if(code.charAt(n - k) == '1')
				a = 1;
			//Else a = 0
			else
				a = 0;
			
			s += q*a;
			q *= 2;
			k++;
		}
		return s;
	}

}
