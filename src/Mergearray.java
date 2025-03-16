//How do you merge two unsorted arrays into single sorted array without duplicates?

//{4, 2, 5, 1} {8, 1, 9, 5};
import java.util.stream.IntStream;
import java.util.Arrays;


class Mergearray{

public static void main(String[] args){
int[] arr1 = new int[]{4, 2, 5, 1};
int[] arr2 = new int[]{8, 1, 9, 5};

int[] mergeArr=IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2)).sorted().distinct().toArray();
System.out.println(Arrays.toString(mergeArr));
}

}