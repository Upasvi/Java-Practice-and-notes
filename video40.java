class MyEmployee{
   private int id;
   private String name;


   public void setName(String n){
    name = n;
   }

   public String getName(){
    return name;
   }

   public void setId(int i){
    id = i;
   }

   public int getId(){
    return id;
   }

}

public class video40 {
    public static void main(String[] args) {
       MyEmployee upasvi = new MyEmployee();
      // upasvi.id= 45;
       //upasvi.name = "yadav";  --> throws an error due to private accesss modifier
       upasvi.setName("yadav");
       System.out.println(upasvi.getName());

       upasvi.setId(5);
       System.out.println(upasvi.getId());
    }
}
