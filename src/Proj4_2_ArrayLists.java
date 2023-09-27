import java.util.Scanner;
import java.util.ArrayList;

public class Proj4_2_ArrayLists {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        ArrayList<Double> myList = new ArrayList<>();

        double userEntry;

        System.out.println("Enter 0 or more to put in the list or -1 to exit");

        userEntry = keyboard.nextDouble();

        while(userEntry >= 0){
            myList.add(userEntry);
            System.out.println("Enter 0 or more to put in the list or -1 to exit");
            userEntry=keyboard.nextDouble();
        }//end while

        for (int i = myList.size() -1; i>= 0; i--){
            System.out.println(myList.get(i));
        }

    }//end main
}
