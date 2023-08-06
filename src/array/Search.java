package array;

public class Search {

	public static void main(String[] args) {
		String name[]= {"aman","kiran","harjit","tina"};
		boolean result=false;
		String find ="har";
		for(String n:name)
		{
		 if(n.equalsIgnoreCase("har"))
		 result= true;
		}
		System.out.println(result);

	}

}
