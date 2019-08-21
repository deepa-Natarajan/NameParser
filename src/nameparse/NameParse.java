package nameparse;

import java.util.LinkedList;
import java.util.Scanner;

public class NameParse {

    public static void main(String[] args) {

        LinkedList<String> nameList = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {

            System.out.println("Enter the name :");
            Name nm = new Name(sc.nextLine());
            nm.Display();
            nameList.add(nm.storeData());
            System.out.println("Continue(Y/N):");
            choice = sc.nextLine();

        }
        
        System.out.println("FirstName"+"\t"+ "MiddleName"+ "\t"+"LastName");
        for (String name:nameList){
        System.out.println(name);
        }
        System.out.println("Thank you!");
                
    }

   
}
