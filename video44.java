class Cylinder{
    private int radius;
    private int height;

    public int getRadius(){
        return radius;
    }

    public void setRadius(int radius){
        this.radius = radius;
    }

    public int getHeight(){
        return height;
    }

    public void setHeight(int height){
        this.height =height;
    }

    public double surfaceArea(){
        return 2*3.14*radius*radius + 2*3.14*radius*height;
    }

    public double volume(){
        return 3.14*radius*radius*height;
    }

}

public class video44 {
  public static void main(String[] args) {
    Cylinder mCylinder = new Cylinder();
    mCylinder.setRadius(10);
    int r = mCylinder.getRadius();
    System.out.println(r);

    mCylinder.setHeight(20);
    int h = mCylinder.getHeight();
    System.out.println(h);

    double a =mCylinder.surfaceArea();
    System.out.println(a);

    double v = mCylinder.volume();
    System.out.println(v);
  }  
}
