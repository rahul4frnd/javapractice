public class ArrayList{
	

		Object arr[];
		int s;
		int capacity;


     ArrayList(){
		capacity=10;
		s=0;
		arr=new Object[capacity];


		}


		public void add(Object item)
		{
		arr[s++] = item;
		}

		public Object get(int index){

		return arr[index];
		}

public int size(){

return s;
}

public static void main(String[] args){

ArrayList list=new ArrayList();
list.add(23);
list.add(54);
list.add(45);
for(int i=0;i<list.size();i++){
System.out.println(list.get(i));


}
System.out.println("list.size()  - >  "+list.size());

		}


}