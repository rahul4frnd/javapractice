 //Given a list of integers, find maximum and minimum of those numbers? 45, 12, 56, 15, 24, 75, 31, 89
 import java.util.List;
 import java.util.Arrays;
 import java.util.Comparator;
 
 class MinMax1{
 
	public static void main(String[] args){
	
		List<Integer> list=Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
		int max=list.stream().max(Comparator.naturalOrder()).get();
		
		int min=list.stream().min(Comparator.naturalOrder()).get();
		
		System.out.println(max);
		System.out.println(min);
	
	
	}
 
 
 }