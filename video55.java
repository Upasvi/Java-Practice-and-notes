interface Bicycle{
    int a = 45;
    void applyBrake(int decrement);
    void speedUp(int increment);
}
interface horn{
    void hornk3g();
    void hornmhn();
}
class AvonCycle implements Bicycle,horn{
    void blowHorn(){
        System.out.println("pee poo pee poo");
    }
    public void applyBrake(int decrement){
        System.out.println("applying brake");
    }

    public void speedUp(int increment){
        System.out.println("applying apeed");
    }

    public void hornk3g(){
        System.out.println("poooooooooo");
    }

    public void hornmhn(){
        System.out.println("peeeeeeeeeeee");
    }
}
public class video55 {
    public static void main(String[] args) {
        AvonCycle c = new AvonCycle();
        c.applyBrake(1);
        //you can create properties in interfaces but you cannot modify the property as they are final
        //System.out.println(c.a);
        c.hornk3g();
        c.hornmhn();
    }
}
