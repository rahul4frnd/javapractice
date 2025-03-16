//How do you get three maximum numbers and three minimum numbers from the given list of integers?

//45, 12, 56, 15, 24, 75, 31, 89

import java.util.*;
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.Comparator;

class MaxMin{
public static void main(String[] args){
List<Integer> list=Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);

List<Integer> ThreeMax=list.stream().sorted(Comparator.reverseOrder()).limit(3).collect(Collectors.toList());
List<Integer> ThreeMin=list.stream().sorted(Comparator.naturalOrder()).limit(3).collect(Collectors.toList());

System.out.println("3 Max Nuumber");
System.out.println(ThreeMax);
System.out.println("------------------------------");
System.out.println("3 Min Number");
System.out.println(ThreeMin);

}


}

