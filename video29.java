/* 
public class video29{
    public static void main(String[] args) {
        float sum =0;
        float[] number = {32.4f , 30.0f, 23.8f , 56.4f , 89.7f };
        for(float element:number){
            sum=sum+element;
        }
        System.out.println("The value of sum is: " +sum);
    }
}
    */

   /* 
    public class video29{
        public static void main(String[] args) {
            int [] number = {23 , 34 , 45 , 56 , 67};
            int x = 56;
            boolean isInArray = false;
            for(int element:number){
                if(x==element){
                    isInArray = true;
                    break;
                }
            }
                if(isInArray){
                    System.out.println("yes");
                }
                else{
                    System.out.println("no");
                }
            }
        }
    
    */

    /*
    public class video29 {
        public static void main(String[] args) {
            float average = 0;
            float sum = 0;
            float [] marks = {23.4f, 64.3f , 86.9f , 90.2f, 100.0f};
            
            for(float element:marks){
                sum = sum+element;
                average = sum/5;
            }
            System.out.println(average);
        }
    }
         */

/* 
         public class video29 {
    public static void main(String[] args) {
        int[][] matrix1 = {{2, 3, 6}, {4, 5, 7}};
        int[][] matrix2 = {{12, 13, 16}, {14, 15, 17}};
        int[][] result = {{0, 0, 0}, {0, 0, 0}};

        for (int i = 0; i < matrix1.length; i++) { // row
            for (int j = 0; j < matrix1[i].length; j++) { // column
                result[i][j] = matrix1[i][j] + matrix2[i][j];
                System.out.print(result[i][j] + " ");
            }
            System.out.println(); // for new row
        }
    }
}
*/

/* 
public class video29 {

     public static void main(String[] args) {
        int [] arr ={1,2,3,4,5,6};
        int l = arr.length;
        int n = Math.floorDiv(arr.length,2);
        int temp;
        for(int i = 0; i<n; i++){
            // swap a[i] and a[li\-i-1]
            temp =arr[i];
            arr[i]=arr[l-i-1];
            arr[l-i-1] = temp;
        }
        for(int element:arr){
            System.out.println(element);
        }
     }
}
     */

/*
     public class video29 {
     
        public static void main(String[] args) {
            int [] arr = {1 , 21 , 3 , 455 , 5 , 34 , 67};
            int max = 0;
            for(int element:arr){
                if(element>max){
                    max = element;
                }
            }
            System.out.println(max);
        }
     }
         */

       /*
       public class video29 {
     
        public static void main(String[] args) {
            int [] arr = {1 , 21 , 3 , 455 , 5 , 34 , 67};
            int min = arr[0];
            for(int element:arr){
                if(element<min){
                    min = element;
                }
            }
            System.out.println(min);
        }
     }   */

     public class video29 {
     
        public static void main(String[] args) {
            boolean isSorted = true;
            int [] arr = {1 , 21 , 3 , 455 , 5 , 34 , 67};
            for(int i =0;i<arr.length;i++){
                if(arr[i] > arr[i+1]){
                    isSorted = false;
                    break;
                }
            }
            if(isSorted){
                System.out.println("sorted");
            }
            else{
                System.out.println("not sorted");
            }
        }
    }