/*public class video35 {
    static void multiplication(int n){
        for(int i =1; i<=10 ; i++){
            System.out.format("%d x %d = %d\n", n,i,n*i);
        }
    }

    public static void main(String[] args) {
        multiplication(2);
    }
}
*/

//-------------------------------------------------------------------------------------

/* 
public class video35 {

    static void pattern(int n){
        for(int i=1; i<=n ; i++){
            for(int j =1 ; j<=i ;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern(4);
    }
}
*/

//--------------------------------------------------

/*public class video35 {

    static int sum(int n){
        if(n==1){
            return 1;
        }
        else{
            return n+sum(n-1);
        }
    }
    public static void main(String[] args) {
       int c= sum(3);
        System.out.println(c);
    }

}
    */

//------------------------------------------------------------------------

 /*public class video35 {
 
    static void pattern(int n){
        for(int i =n;i>0;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern(4);
    }
 }
    */


//-------------------------------------------------------------------------------------------------------


/*public class video35 {

    static int fib(int n){
        if(n==1){
            return 0;
        }
        else if(n==2){
            return 1;
        }
        else{
            return fib(n-1) + fib(n-2);
        }
    } 

    public static void main(String[] args) {
        int result =fib(5);
        System.out.println(result);
    }
}
    */

//-------------------------------------------------------------------------------------


/*public class AverageRecursiveEasy {

    // Recursive function to find sum
    static int findSum(int[] arr, int index) {
        if (index == arr.length)
            return 0;
        return arr[index] + findSum(arr, index + 1);
    }

    // Function to calculate average
    static double findAverage(int[] arr) {
        int sum = findSum(arr, 0);  // start from index 0
        return (double) sum / arr.length;
    }

    public static void main(String[] args) {
        int[] numbers = {5, 10, 15, 20};
        double average = findAverage(numbers);
        System.out.println("Average = " + average);
    }
}

*/