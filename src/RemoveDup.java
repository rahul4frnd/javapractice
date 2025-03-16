//"Java", "Python", "C#", "Java", "Kotlin", "Python"
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

class RemoveDup{
public static void main(String[] args){

List<String> listofString=Arrays.asList("Java", "Python", "C#", "Java", "Kotlin", "Python");

List<String> stringUnique=listofString.stream().distinct().collect(Collectors.toList());
System.out.println(stringUnique);



}


}