// public class video33 {
//     static int sum(int a,int b){
//         return a+b;
//     }
//     public static void main(String[] args) {
//         System.out.println("welcome");
//         System.out.println(sum(4,3));
//     }
// }

public class video33 {
    static int sum(int...arr){
       //available as int [] arr;
       int result = 0;
       for(int a:arr){
        result +=a;
       }
       return result;
    }
    public static void main(String[] args) {
        System.out.println("welcome");
        System.out.println(sum(4,3));
        System.out.println(sum(4,3,2));
        System.out.println(sum(4,3,2,1));
    }
} 