import java.util.Scanner;

public class Proj4_1_Arrays {
    public static void main(String[] args) {
        int[] myArray = new int[5];
        int userInput = 0;
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < myArray.length; i++) {
            System.out.println("Please enter an integer");
            userInput = input.nextInt();
            myArray[i] = userInput;
        }//end for loop
        for(int num : myArray){
            System.out.println(num * 2);
        }//end enhanced for loop


    }//end main
}
