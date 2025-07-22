class circle{
    public int radius;
    circle(int r){
        System.out.println("I am circle constructor");
        this.radius = r;
    }
    

    public double area(){
        return this.radius*this.radius*3.14;
    }
}

class cylinder extends circle{
    cylinder(int r, int h){
        super(r);
        System.out.println("i am cylinder constructor");
        this.height = h;
    }
    public int height;
    public double volume(){
        return 3.14*this.radius*this.radius*this.height;
    }
}
public class video52 {
    public static void main(String[] args) {
        cylinder obj = new cylinder(12,4);
        //circle objc = new circle(12,4);
    }
}
