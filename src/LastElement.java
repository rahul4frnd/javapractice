import java.util.List;
import java.util.Arrays;


class LastElement{
	public static void main(String[] args)
	{
	List<String> listOfStrings = Arrays.asList("One", "Two", "Three", "Four", "Five", "Six");
	String lastelemen=listOfStrings.stream().skip(listOfStrings.size()-1).findFirst().get();
	
	
	System.out.println(lastelemen);
	
	
	}


}

