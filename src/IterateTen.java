import java.util.stream.Stream;

class IterateTen{
		public static void main(String args[])
		{
			Stream.iterate(new int[] {1, 2}, f -> new int[] {f[1], f[1]+1})
                .limit(10)
                .map(f -> f[0])
                .forEach(i -> System.out.print(i+" "));


		}
}