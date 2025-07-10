/*// Print numbers from 1 to 10

public class practice {
    public static void main(String[] args){
 int n= 10;
    for(int i =1;i<=n;i++){
System.out.println(i);
    }
    }
   
}
*/

//------------------------------------------------------------------------------------

/* 
//Print even numbers from 1 to 50
public class practice{
    public static void main(String[] args){
        int n =50;
        for(int i =1; i<=n;i++){
            if(i%2==0){
            System.out.println(i);
            }
        }
    }
}

*/

//-------------------------------------------------------------------------------------------

/* 
//Print odd numbers from 1 to 50
public class practice{
    public static void main(String[] args){
        int n = 50;
        for(int i = 1; i<=n;i++){
            if(i%2 !=0){
                System.out.println(i);
            }
        }
    }
}

*/


//-----------------------------------------------------------------------------------------------------------
/* 
//Print numbers from 10 to 1 (reverse order)
public class practice{
    public static void main(String[] args){
        int n = 10;
        for(int i = 10; i>0;i--){
            System.out.println(i);
        }

    }
}
    */


//----------------------------------------------------------------

/* 
//Print multiplication table of any number (e.g., 7)

public class practice{
    public static void main(String[] args){
        int n = 10;
        int result =1;
        for(int i =0; i<=10;i++){
            result = 7*i;
            System.out.println("2 x " + i + " = " + result);
        }
    }
}

*/


//-------------------------------------------------------------------------------

//Calculate sum of first N natural numbers

/*public class practice{
    public static void main(String[] args){
        int n = 10;
        int sum = 0;
        for(int i =0;i<=10;i++){
            sum=sum+i;
            
        }
        System.out.println(sum);
    }
}
*/

//-------------------------------------------------------------------------

//Calculate factorial of a given number
/*  public class practice{
    public static void main(String[] args){
        int n = 5;
        int factorial = 1;
        for(int i =5;i>0;i--){
            factorial = factorial*i;
            
        }
        System.out.println(factorial);
    }
 }
    */

//----------------------------------------------------------------

/*Print the following pattern using for loop:

*
* *
* * *
* * * *
\
*/
/* 
public class practice {

    public static void main(String[] args) {
        int n = 4;
        for(int i = 1; i<=4;i++){
            for(int j =1;j<=i;j++){
                System.out.print("*");
            }
           System.out.println("\n");
        }
    }
}
    */


//--------------------------------------------------------------------

/*
 Print the reverse of above pattern:
 * * * *
* * *
* *
*

 */
/* 
 public class practice {
 
    public static void main(String[] args) {
        int rows=4;
        for(int i = 4; i>0;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("\n");
        }
    }
 }
    */

//-----------------------------------------------------------------------

/*Print square pattern of stars:

* * * *
* * * *
* * * *
* * * *

*/

/* 
public class practice{
    public static void main(String[] args){
        int rows=4;
        for(int i = 1;i<=rows;i++){
            for(int j = 1; j<=4;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
*/

//--------------------------------------------------------------------------------


//Print squares of numbers from 1 to 10
/* 
public class practice {

    public static void main(String[] args) {
        int n= 10;
        for(int i=1;i<=10;i++){
               System.out.println(i*i); 
        }
    }
}
*/


//-----------------------------------------------------------

//Find the sum of digits of a number (e.g., 456 → 4+5+6 = 15)
/* import java.util.Scanner;
public class practice {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int sum=0;
        while (num > 0) {
            int digit = num % 10;  // Get the last digit
            sum += digit;          // Add it to sum
            num = num / 10;        // Remove the last digit
        }
        System.out.println(sum);
    }
}

// % 10 gives the last digit.

// / 10 removes the last digit.
*/

//----------------------------------------------------------------------------------------------------------------
//Print Fibonacci series up to N terms

/*
import java.util.Scanner;
public class practice {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        int f =1;
        int s=1;
        int t;

        System.out.println(f);
        System.out.println(s);

        for(int i =3; i<=num;i++){
            t=f+s;
            System.out.println(t);
            f=s;
            s=t;
        }
    }
}
    */


//-----------------------------------------------------------------------------------------------------------------

//Find the reverse of a number (e.g., 123 → 321)

import java.util.Scanner;
public class practice {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

    int reverse = 0;
    while(num>0){
        int lastdigit= num%10;
        reverse = reverse*10+lastdigit;
        num=num/10;
    }

        System.out.println("Reversed number: " + reverse);

    }
}