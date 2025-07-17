class Employee{
    int id;
    String name;
    public void printDetails(){
        System.out.println("my id is "+ id);
        System.out.println("my name is "+ name);
    }
}

public class video38 {
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        Employee upasvi = new Employee();   //Instantiating a new employee object
        Employee john = new Employee();  
       
        //setting attributes
        upasvi.id = 12;
        upasvi.name = "yadav"; 
        john.id = 132;
        john.name = "sher"; 

        //System.out.println(upasvi.id);
        // System.out.println(upasvi.name);

        upasvi.printDetails();
        john.printDetails();
    }
}
