//{4, 2, 5, 1} {8, 1, 9, 5};

import java.util.Arrays;
import java.util.stream.Stream;
import java.util.List;
import java.util.Comparator;
import java.util.stream.Collectors;

class ArrayMerge{
public static void main(String[] args){
 List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "HTML", "Kotlin", "C++", "COBOL", "C");

listOfStrings.stream().sorted(Comparator.comparing(String::length)).forEach(System.out::println);


	}


}