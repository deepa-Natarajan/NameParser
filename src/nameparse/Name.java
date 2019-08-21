package nameparse;

import java.util.Arrays;

public class Name {

    StringBuilder obj = new StringBuilder();

    public Name(String name) {
        obj.append(name);
    }

   
    String storeData() {
        String dat = obj.toString();
        String d = dat.trim();
        String[] data = d.split(" ");
        String name = " ";

        if (data.length == 3) {
             name=(data[0] +"\t\t"+ data[1]+"\t\t"+ data[2]);
        }
        if (data.length == 2) {
             name=(data[0] + "\t\t"+""+"\t\t" + data[1]);

        }
         
        
        return name;
    }

    void Display() {

        String name = obj.toString();
        String n = name.trim();
        String[] nameParts = n.split(" ");
       

        if (nameParts.length == 3) {
            System.out.println ("First Name: " + nameParts[0] + "\n" + "Middle Name: " + nameParts[1] + "\n" + "Last Name: " + nameParts[2]);

        }
        if (nameParts.length == 2) {
           System.out.println ("First Name: " + nameParts[0] + "\n" + "Last Name: " + nameParts[1]);

        } else if (nameParts.length == 1 || nameParts.length > 3) {
             System.out.println ("Enter the name with 2 or 3 parts- First and last name or "
                    + "First, Middle and last Name.");
        }
    }
}
       

    

    


