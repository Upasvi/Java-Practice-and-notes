class A{
    public int a;
    public int meth1(){
        return 4;
    }
    public void meth2(){
        System.out.println("i am meth 2 of class A");
    }
}

class B extends A{
    public void meth2(){
        System.out.println("i am meth2 of class B");
    }
}
public class video48 {
    public static void main(String[] args) {
        A a = new A();
        a.meth2();
        B b = new B();
        b.meth2();
    }
}
