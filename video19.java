

/*import java.util.Scanner;

public class video19 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("url:");
        String url = sc.nextLine();
        if(url.endsWith(".com")){
            System.out.println("commercial website");
        }
        else if(url.endsWith(".in")){
            System.out.println("Indian website");
        }
        else if(url.endsWith(".org")){
            System.out.println("Organization website");
        }
        else{
            System.out.println("null");
        }

    }
}
*/


/*import java.util.Scanner;

public class video19 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year");
        int year = sc.nextInt();

        if(year % 400 == 0){
            System.out.println("leap year");
        }
        else if(year % 4 == 0 && year % 100 != 0){
            System.out.println("leap year");
        }
        else {
            System.out.println("not a leap year");
        }
    }
}

*/



/*import java.util.Scanner;
public class video19 {
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the number");
         int number = sc.nextInt();

         switch(number){
            case 1:
            System.out.println("Monday");
            break;

            case 2:
            System.out.println("Tuesday");
            break;

            case 3:
            System.out.println("Wednesday");
            break;

            case 4:
            System.out.println("Thrusday");
            break;

            case 5:
            System.out.println("Friday");
            break;

            case 6:
            System.out.println("Saturday");
            break;

            case 7:
            System.out.println("Sunday");
            break;

            default:
            System.out.println("null");
         }
    }
}
*/

/*import java.util.Scanner;
public class video19 {
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
       System.out.println("Enter your income in Lakhs per annum");
       float tax = 0;
       float income = sc.nextFloat();
       if(income<=2.5){
           tax = tax + 0;
       }
       else if(income>2.5f && income <= 5f){
           tax = tax + 0.05f * (income - 2.5f);
       }
       else if(income>5f && income <= 10.0f){
           tax = tax + 0.05f * (5.0f - 2.5f);
           tax = tax + 0.2f * (income - 5f);
       }
       else if(income>10.0f){
           tax = tax + 0.05f * (5.0f - 2.5f);
           tax = tax + 0.2f * (10.0f - 5f);
           tax = tax + 0.3f * (income - 10.0f);
       }

       System.out.println("The total tax paid by the employee is: " + tax);

    }
}

*/



/*import java.util.Scanner;
public class video19 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("marks1: ");
        int marks1 = sc.nextInt();
        System.out.println("marks2: ");
        int marks2 = sc.nextInt();
        System.out.println("marks3: ");
        int marks3 = sc.nextInt();
        
        int sum = marks1+marks2+marks3;
        float percentage = (sum)/3;
        System.out.println("percentage: " + percentage);

        if(percentage>=40 && marks1>=33 && marks2>=33 && marks3>=33){
            System.out.println("pass");
        }
        else{
            System.out.println("fail");
        }
    }
}*/
