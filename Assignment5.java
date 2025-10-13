import java.util.Scanner;
public class App {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    factorial_method();
    every_other();
    reverse_string();

    
    }

    public static void factorial_method() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        System.out.println("The factorial of " + number + " is " + factorial);
        
    }

    public static void every_other() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= number; i+= 2) {
            sum *= i;
        }
        System.out.println("The sum of every other number up until " + number + " is " + sum);


    }
    

    public static void reverse_string() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String word = sc.nextLine();
        String reverse = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reverse += word.charAt(i);
        }

        System.out.println(reverse + " is the opposite of " + word);
    }



   

  
}
