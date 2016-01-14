/**
 method overloading.
 */
class add {

    void  Add(int a, int b) {
        int c = a + b;
        System.out.println(c);
    }
    void  Add(int a, int b,int c) {
        int d = a + b + c;
        System.out.println(d);
    }
}
public class TestClass {
    public static void main(String[] args){

        Add a=new Add();
        a.Add(3,4);
        a.Add(3,4,6);

    }


}
