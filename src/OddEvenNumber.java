import java.util.*;
import java.util.Arrays;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;
class OddEvenNumber{
public static void main(String[] args){

List<Integer> listOfIntegers = Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87);
Map<Boolean,List<Integer>> oddevennumbermap= listOfIntegers.stream().collect(Collectors.partitioningBy(i->i%2==0));
Set<Entry<Boolean,List<Integer>>> entrySet=oddevennumbermap.entrySet();

for(Entry<Boolean,List<Integer>> entry:entrySet){

		if(entry.getKey()){

		System.out.println("Even number");

		}else{

		System.out.println("Odd number");

		}

System.out.println("---------------------");
List<Integer>list=entry.getValue();
for(int i:list){

System.out.println(i);
}

}
}


}