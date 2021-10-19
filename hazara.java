import java.util.Arrays;
import java.util.Scanner;

public class hazara {

    static int negativesInArray(double [] arr){
        int counter=0;
        for( double number : arr ){
            if (number<0){
                counter ++;
            }
        }
        return  counter;
    }

    public static void main(String[] args) {
        Scanner sc1= new Scanner(System.in);
        double [] array = new double[9];
        for (int i =0; i<array.length;i++){
            System.out.println("please enter a real number");
            array[i]=sc1.nextDouble();
        }
        System.out.println("the amount of the negative numbers in the array is : ");
        System.out.println(Arrays.toString(array));
        System.out.println(negativesInArray(array));

    }
}
