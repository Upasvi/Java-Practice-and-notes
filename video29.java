/*public class video29 {
    public static void main(String[] args) {
        float [] marks= {10.1f, 20.5f, 30.8f, 40.2f, 50.6f};
        float sum = 0;
        for( float element:marks){
            sum= sum+element;
        }
        System.out.println("The value of sum is:" + sum);
    }
}
    */


public class video29 {

    public static void main(String[] args) {
        int [] marks = {10,20,30,40,50};
        int num=60;
        for(int elements:marks){
            if(num==elements){
                System.out.println("yes");
            }
            else{
                System.out.println("no");
            }
        }

    }
}
