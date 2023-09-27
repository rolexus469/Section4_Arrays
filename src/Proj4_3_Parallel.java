import java.util.ArrayList;
import java.util.Scanner;

public class Proj4_3_Parallel {
    public static void main(String[] args) {
        Scanner keyboardName = new Scanner(System.in);
        Scanner keyboardAge = new Scanner(System.in);
        ArrayList<String> namesList = new ArrayList<>();
        ArrayList<String> ageList = new ArrayList<>();

        String userName;
        String userAge;


        while (ageList.size() <=4){
            System.out.println("Enter a name: " );
            userName = keyboardName.next();
            namesList.add(userName);

            System.out.println("Enter an age: " );
            userAge = keyboardAge.next();
            ageList.add(userAge);

        }//end while loop
        for(int i = 0; i < ageList.size(); i++){
            System.out.println(namesList.get(i) + " is " + ageList.get(i) + " years old");
        }
    }//end main
}

