class Base{
    public int x;

    public int getX(){
        return x;
    }

    public void setX(int x){
        System.out.println("i am in base and setting x now");
        this.x = x;
    }

    public void printMe(){
        System.out.println("i am a constructor");
    }

}

class Derived extends Base{
    public int y;

    public int getY(){
        return y;
    }

    public void setY(int y){
        this.y = y;
    }
}
public class video45 {
    public static void main(String[] args) {
         //Creating an object of base class
        Base b = new Base();
        b.setX(4);
        System.out.println(b.getX());

        //Creating an object of derived class
        Derived d = new Derived();
        d.setX(43);
        System.out.println(d.getX());
    }
}
