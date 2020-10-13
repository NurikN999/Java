public class CharactersTest{
	public static void main(String[] args) {
		String message = "Welcome to Java";
		String s1 = "Welcome to ";
		String s2 = "Java";
		String s3 = s1.concat(s2);
		System.out.println(s3);
		System.out.println("length of message is " + message.length());
		System.out.println("First letter of message is " + message.charAt(0));
		System.out.println("Last letter of the message is " + message.charAt(14));
	}
}