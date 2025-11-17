import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args){
        //do you need something to start?
        File inputfile = new File("practice.txt");
        List<String> smartStudents = new ArrayList<>(); // list for 
        int totalStudentCount = 0;

        try {
            Scanner input = new Scanner(inputfile); //scanning the file so we can prepare to read from it

            while(input.hasNext()){
                String line = input.nextLine();
                double studentGpa = Double.parseDouble(input.nextLine());
                totalStudentCount++;  

                if (studentGpa > 3.5) {
                    smartStudents.add(line);
                }
              
            }
        // catch any errors thrown at us
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        System.out.println(smartStudents); // print out the names of students with a gpa of 3.5 or higher.
        System.out.println(totalStudentCount); // print out the total amount of names
    };
}


// I learned how to read files and take out information from a certain file and print it out or use it for storing something. This has potential to be incredibly useful.
