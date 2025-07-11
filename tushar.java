/*import java.util.Scanner;
public class tushar {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the num1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the operator: ");
        String operator = sc.next();
        System.out.println("Enter the num2: ");
        int num2 = sc.nextInt();

        if(operator.equals("+")){/////or operator == '+'
            System.out.println("The final outcome: "+(num1 + num2));
        }
        else if(operator.equals("-")){
            System.out.println("The final outcome: "+ (num1-num2));
        }
        else if(operator.equals("*")){
            System.out.println("The final outcome: "+ (num1*num2));
        }
        else if(operator.equals("/")){
            System.out.println("The final outcome: " + (num1/num2));
        }
        
        
    }
    
}
*/


import java.util.Scanner;
public class tushar {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the num1: ");
        int num1 = sc.nextInt();
        
        int digit4 = num1%10;
        int digit3= (num1/10)%10;
        int digit2=(num1/100)%10;
        int digit1 = (num1/1000)%10;

        if((digit1+digit2) == (digit3+digit4)){
            System.out.println("lucky");
        }
        else{
            System.out.println("unlucky");
        }

    }
}