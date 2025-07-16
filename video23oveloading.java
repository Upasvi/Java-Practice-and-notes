public class video23oveloading {
    static void foo(){
        System.out.println("hi");
    }
    static void foo(int a){
        System.out.println("hi " + a + " bro");
    }

    static void foo(int a,int b){
        System.out.println("hi " + a + " bro");
         System.out.println("hi " + b + " bro");
    }

    //method overloading 
    public static void main(String[] args) {
        foo();
    foo(300);
    foo(2,3);
    //arguments are actual
    } 
}
