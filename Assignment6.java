public class App {
    public static void main(String[] args) throws Exception {

// new students being added
        student student1 = new student("Philip", "2012", 3.40, 123);
        student student2 = new student("John","2015",3.14,234);
        student student3 = new student("Joe","2019",3.00,433);
        student student4 = new student("Sofia","2012",2.89,556);
        student student5 = new student("Ella","2012",4.00,235);

// running both methods
        student1.honorRoll();
        student3.honorRoll();
        student2.honorRoll();
        student4.honorRoll();
        student5.honorRoll();

        student1.freeLunch();
        student2.freeLunch();
        student3.freeLunch();
        student4.freeLunch();
        student5.freeLunch();

    }
}



import java.util.Random;
// new tab 
public class student {
    String name;
    String year;
    double gpa;
    int id;
// 
    public student(String n, String y, double g, int i) {
        name = n;
        year = y;
        gpa = g;
        id = i;
    }
// making a method to see honor roll status    
    public void honorRoll(){
        if (this.gpa > 3.6){
            System.out.println("You are an honor roll student");
        } else {
            System.out.println("You are not a honor roll student");
        }
    } 
  // making a method to see if the student gets free lunch 
    public void freeLunch(){
        int random_id = (int)(Math.random()*1000); // making a random number from 0 to 1000
        if (this.id == random_id) {
            System.out.println("You earned a free lunch!");
        } else {
            System.out.println("You don't have a free lunch");
        }
    }

}




// I learned about how to create a new public class by using another tab on the src.
// I also learned how to make the main look cleaner by really only using it to create different students (in this case) and running the different methods.
