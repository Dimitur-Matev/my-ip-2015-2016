import java.util.Scanner;
public class TextInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enther yoyr name:");
		// instead of scanner we can use BufferedReader
		final Scanner in = new Scanner(System.in);
		final String name = in.next();
		System.out.println("Hello, "+name);
		in.close(); 
	}

}
