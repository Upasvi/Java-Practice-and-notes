/* 
class Base{
    Base(){
        System.out.println("I am a constructor");
    }
    Base(int a){
        System.out.println("I am a overloaded constructor with value of a as: " + a);
    }
}

class Derived extends Base{
    Derived(){
        super(0);
        System.out.println("I am a derived constructor");
    }

    
}
public class video46 {
    public static void main(String[] args) {
      //  Base b = new Base();
        Derived d = new Derived(); //base class ka constructor bhi run hoga aur derived ka bhi 
    }
}
*/


class Base{
    Base(){
        System.out.println("I am a constructor");
    }
    Base(int x){
        System.out.println("I am a overloaded constructor with value of x as: " + x);
    }
}

class Derived extends Base{
    Derived(){
        //super(0);
        System.out.println("I am a derived constructor");
    }

    Derived(int x, int y){
        super(x);
        System.out.println("I am an overloaded constructor od derived with value of y as: " + y);
    }
    
}

class ChildOfDerived extends Derived{
    ChildOfDerived(){
        System.out.println("I am a child of derived constructor");
    }

    ChildOfDerived(int x , int y , int z){
        super(x,y);
        System.out.println("I am an overloaded constructor of derived  with value of z as: " +z);
    }
}
public class video46 {
    public static void main(String[] args) {
      //  Base b = new Base();
     //   Derived d = new Derived(); //base class ka constructor bhi run hoga aur derived ka bhi 

     //Derived d = new Derived(14,9);
     ChildOfDerived cd = new ChildOfDerived();
    }
}