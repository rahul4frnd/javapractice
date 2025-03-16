 //Given a list of integers, find maximum and minimum of those numbers? 45, 12, 56, 15, 24, 75, 31, 89
 import java.util.List;
 import java.util.Arrays;
 
 class MinMax{
 
	public static void main(String[] args){
	
		List<Integer> list=Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
		int max=list.stream().max().get();
		
		int min=list.stream().min().get();
		
		System.out.println(max);
		System.out.println(min);
	
	
	}
 
 
 }