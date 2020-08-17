class Parameterized{
    int i;
    String s;
    Parameterized(int i,String s)
    {
        this.i=i;
        this.s=s;
        System.out.println(i+" "+s);
    }
}
public class ParameterizedConstructor {
     public static void main(String args[])
    {
        Parameterized obj3=new Parameterized(10,"Java");
    }
}
