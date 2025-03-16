class FindIndex{
public static void main(String[] args)
{
	int[] arr={23,43,11,45,20,16,24};
	int element=45;
	for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==element)
			{
			System.out.println(i);
			}
		}

}
}