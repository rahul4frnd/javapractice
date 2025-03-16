import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

class OddEvenNum{

public static void main(String[] args){

	List<Integer> list= Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87);

	System.out.println(list);

Map<Boolean,List<Integer>> map=list.stream().collect(Collectors.partitioningBy(i->i%2==0));
Set<Entry<Boolean,List<Integer>>> entryset=map.entrySet();
for(Entry<Boolean,List<Integer>> entry:entryset){

if(entry.getKey()){

System.out.println("Even Number");
}
else{

System.out.println("Odd Number" );
}

List<Integer> value=entry.getValue();
for(int val:value)
System.out.println(val);

}

}

}