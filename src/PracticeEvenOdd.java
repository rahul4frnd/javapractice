import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.Set;
import java.util.Map;
import java.util.Map.Entry;


class PracticeEvenOdd{
public static void main(String args[]){
List<Integer> list=Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87);

Map<Boolean,List<Integer>> map=list.stream().collect(Collectors.partitioningBy(i->i%2==0));
Set<Entry<Boolean,List<Integer>>> entryset=map.entrySet();
for(Entry<Boolean,List<Integer>> entry:entryset){

if(entry.getKey()){
System.out.println("Even");

}else{
System.out.println("Odd");

}


List<Integer> entrylist=entry.getValue();

for(int num:entrylist){
System.out.println(num);

}

}




}




}