class Employee{
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
public class video39 {
    public static void main(String[] args) {
        Employee upasvi = new Employee();
    upasvi.setName("code with upasvi");
        System.out.println(upasvi.getName());
    }
    
    
}
