class phone{
    public void name(){
        System.out.println("My name is java in phone");
    }

    public void greet(){
        System.out.println("Good morning");
    }
}

class smartPhone extends phone{
    public void swagat(){
        System.out.println("aapka swagat h");
    }
    public void name(){
        System.out.println("my name is java in class smartphone");
    }
}
public class video49 {
    public static void main(String[] args) {
        phone obj = new smartPhone();  //yes it is allowed
       // smartPhone obj = new phone();    --> Not Allowed
        obj.name();
    }
}
