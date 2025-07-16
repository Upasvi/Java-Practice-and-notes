
// public class video32 {
//     static void tellJoke(){
//         System.out.println("hahahahaha");
//     }

//     public static void main(String[] args) {
//         tellJoke();
//     }
// }
public class video32 {
    static void change(int a){
    a = 98;
}
     static void change2(int [] marks){
    marks[0] = 98;
}


public static void main(String[] args){
    int [] marks = {52, 76 , 86 , 89 , 75};

    //Case 1.) Changing the Integer
    //int x = 45;
    //Case 2.) change in array
    change2(marks);
    System.out.println("The value of x after running change is : " + marks);
}
}