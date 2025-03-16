// Find sum of all digits of a number in Java 8?

import java.util.*;
import java.util.stream.Stream;
import java.util.stream.Collectors;


class Sum{

public static void main(String[] args){
int i = 15623;
int sum=Stream.of(String.valueOf(i).split("")).collect(Collectors.summingInt(Integer::parseInt));
System.out.println(sum);

}
}
