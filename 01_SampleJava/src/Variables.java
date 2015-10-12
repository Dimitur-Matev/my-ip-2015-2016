
public class Variables {
	//string literal marked + CTRL + 1 -> extract to constant = constant 
	private static final String HELLO_WORLD = "Hello World";
	
	public static void main(String[] args) {
		//a=0; scope - definition to the end of the function
		int a;
		
		a = 0;
		
		String b = HELLO_WORLD;
		
		//impossible!!!
		//HELLO_WORLD = "asdfghjhgfdsasdrfghjkhgfds"
		
	}
}
