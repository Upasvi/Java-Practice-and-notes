/*class Employee{
    int Salary;
    String name;

    public int getSalary(){
        return Salary;
    }

    public String getName(){
        return name;
    }

    public void setName(String n){
        name = n;
    }

}


class cellPhone{
    public void ringing(){
        System.out.println("ringing");
    }

    public void vibrating(){
        System.out.println("vibrating");
    }

    public void callFriend(){
        System.out.println("calling");
    }
}



public class video39 {
    public static void main(String[] args) {
        Employee upasvi = new Employee();
    upasvi.setName("code with upasvi");
        System.out.println(upasvi.getName());


        cellPhone asus = new cellPhone();
    asus.callFriend();
    asus.ringing();
    asus.vibrating();
    }

}
*/


/*
class square{
    int side;
    
    public int perimeter(){
       return 4*side;
    }

    public int area(){
        return side*side;
    }
    
}

public class video39 {

    public static void main(String[] args) {
        square sq = new square();
        sq.side=4;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());

    }
} */


/*class rectangle{
    int a;
    int b;

    public int perimeter(){
        return 2*(a+b);
    }

    public int area(){
        return 2*a*b;
    }
}


public class video39 {

    public static void main(String[] args) {
        rectangle rc = new rectangle();
        rc.a=2;
        rc.b=3;

        System.out.println(rc.area());
        System.out.println(rc.perimeter());
    }
}
    */


class TommyVecetti{

    public void hit(){
        System.out.println("hitting");
    }

     public void run(){
        System.out.println("running");
    }

     public void fire(){
        System.out.println("firing");
    }
}


public class video39 {

    public static void main(String[] args) {
        TommyVecetti show = new TommyVecetti();
        show.hit();
        show.run();
        show.fire();
    }
}