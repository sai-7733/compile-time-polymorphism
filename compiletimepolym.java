class A{
    void m1(int a){
        System.out.println(a);
    }
    void m1(int a,int b){
        System.out.println(a+b);
    }
    double m1(double a){
        return a*a;
    }
    String m1(String c){
        return c;
    }
}
public class B{
    public static void main(String args[]){
        A obj=new A();
        obj.m1(10);
        obj.m1(20,30);
        System.out.println(obj.m1(5.5));
        System.out.println(obj.m1("sai"));
    }
}