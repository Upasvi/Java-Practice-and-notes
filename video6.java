// percentage of 5 subjects
import java.util.Scanner;
public class video6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of subject 1: ");
        int a = sc.nextInt();
        System.out.println("Enter the marks of subject 2: ");
        int b = sc.nextInt();
        System.out.println("Enter the marks of subject 3: ");
        int c = sc.nextInt();
        System.out.println("Enter the marks of subject 4: ");
        int d = sc.nextInt();
        System.out.println("Enter the marks of subject 5: ");
        int e = sc.nextInt();
        float sum = (a+b+c+d+e);
        System.out.println(sum);
        float average = sum/500;
        System.out.println(average);
        float percentage = average*100;
        System.out.println("The percentage of 5 subjects is: ");
        System.out.println(percentage);
    }

}
