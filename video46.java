class Base{
    Base(){
        System.out.println("I am a constructor");
    }
}

class Derived extends Base{
    Derived(){
        System.out.println("I am a derived constructor");
    }

    
}
public class video46 {
    public static void main(String[] args) {
        Base b = new Base();
        Derived d = new Derived(); //base class ka constructor bhi run hoga aur derived ka bhi 
    }
}
