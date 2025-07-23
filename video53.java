abstract class Parent2{
    public Parent2(){
        System.out.println("mai parent2 ka constructr hu");
    }
    public void sayHello(){
        System.out.println("Hello1");
    }

    abstract public void greet();
}

class child2 extends Parent2{
    @Override
    public void greet(){
        System.out.println("Good Morning");
    }
}
public class video53 {
    public static void main(String[] args) {
        child2 c = new child2();
        c.greet();
        
    }
}
