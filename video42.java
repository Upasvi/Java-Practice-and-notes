class MyMainEmployee{
    private int id;
    private String name;

     public MyMainEmployee(){
        id = 45;
        name ="upasvi";
     }

     public MyMainEmployee(String myName, int myId){
        id = myId;
        name = myName;
     }

     public String getName(){
        return name;
     }

     public void setNme(String n){
        this.name = n;
     }

     public void setId(int i){
        this.id = i;
     }

     public int getId(){
        return id;
     }
}
public class video42 {
    public static void main(String[] args) {
        MyMainEmployee upasvi = new MyMainEmployee("program",12);
        System.out.println(upasvi.getId());
        System.out.println(upasvi.getName());
    }
}
