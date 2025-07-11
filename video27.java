public class video27 {
    public static void main(String[] args) {
        int [] marks = {10,20,30,50,60};
        float [] marks2 = {40.2f , 34.6f , 56.7f , 78.0f};
        String [] students = {"Harry" , "Ram" ,"Shyam"};
        System.out.println(marks.length);
        System.out.println(marks2[3]);
        System.out.println(students[2]);

        // Displaying the array(for loop)
        for(int i = 0; i<marks.length;i++){
            System.out.println(marks[i]);
        }

        //reverse printing
        System.out.println("reverse order");
        for(int i = marks.length-1;i>=0;i--){
            System.out.println(marks[i]);
        }

        //for each loop
        System.out.println("for each loop");
        for(int element : marks){
            System.out.println(element);
        }
    }
}
