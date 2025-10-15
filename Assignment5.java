import java.util.Scanner;
public class App {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    // calling in our first method
    factorial_method();
    // calling in our second method
    every_other();
    // calling in our third method
    reverse_string();

    }
    // part 1 (question 2 - factorial) 
    public static void factorial_method() {
        // calling in new scanner so we can take outputs
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        // saving the number we get from user to use for our method
        int number = sc.nextInt();
        // we start at 1 because its a series of multiplying 
        int factorial = 1;
        // multiplying all numbers from 1 up until the users number 
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        // telling the user what our outcome is from their number
        System.out.println("The factorial of " + number + " is " + factorial);
        
    }

    public static void every_other() {
        // calling in a new scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        // saving their output to use for our methof
        int number = sc.nextInt();
        int sum = 0;
        // we add up every other number starting from 1, we use i+=2 to skip every other number
        // we then add up every number to our "sum" which starts at 0
        for (int i = 1; i <= number; i+= 2) {
            sum += i;
        }
        // returning the outcome to the user
        System.out.println("The sum of every other number up until " + number + " is " + sum);


    }
    

    public static void reverse_string() {
        // calling in a new scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        // saving their string as "word"
        String word = sc.nextLine();
        // creating an empty string to hold our reverse string
        String reverse = "";
        // looping through the string backwards (i--)
        for (int i = word.length() - 1; i >= 0; i--) {
            // we add the characters we get to our reverse string
            reverse += word.charAt(i);
        }
        // returning the outcome to the user
        System.out.println(reverse + " is the opposite of " + word);
    }

    // DEBUG !

    // this method tells a user if their number is even or odd
    public static void EvenOrOdd() {
        // putting in new scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        // saving their number 
        int number = sc.nextInt();
        // checking if their number is even and returning the outcome
        if (number % 2 == 0) { // if the number is divisible by 2 its even hence why we use % 2 == 0!
            System.out.println("Your number is even");
        } else {
            System.out.println("Your number is odd");
        }
    }



   

  
}
