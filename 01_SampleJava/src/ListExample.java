import java.util.List;
import java.util.LinkedList;
public class ListExample {

	public static void main(String[] args) {
		final List<String> invited = new LinkedList<String>();
		
		invited.add("Ivan");
		invited.add("Pethar");
		
		for(String name : invited){
			System.out.println(name + "is invited");
		}
		
		System.out.println("All invited: " + invited.size());
		
		invited.remove("Ivan");
		
		for(String name : invited){
			System.out.println(name + "is invited");
		}
		
		System.out.println("All invited: " + invited.size());

	}

}
