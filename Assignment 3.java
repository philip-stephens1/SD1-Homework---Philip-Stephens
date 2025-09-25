import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        //P1: This one only prints 0-9, can you fix it so it prints 1-10?
        System.out.println("Problem 1");
        for (int i = 0; i <= 10; i++){
            System.out.println(i);
        }

        //P2: Ask the user for a number. Create a loop to find the factorial of it
        //(factorial = X!, X being the user input, Factorials are every digit before X multiplied together)
        System.out.println("Problem 2");
        System.out.println("Enter a number and I will tell you the factorial: ");
        //here's a hint
        int num = sc.nextInt();
        int factorial = 1;
        for (int i = 1; i <= num; i++){
            factorial *= i;
        // In this code block we take the input from the user (num) and then use a for loop that starts from 1 (i) and runs until we reach that number (i <- num)
        // We then multiply the factorial with whatever i is at that current state.
        }

        //P3: Ask the user for a number, and then add together every OTHER digit (starting from 1)
        System.out.println("Problem 3");
        System.out.println("Enter a number and I will tell you the sum of every other number: ");
        //No hint! what do you need to complete this task?
        int input = sc.nextInt();
        int sum = 0;

        for (int i = 0; i <= input; i++) {
            sum = sum + i;
            System.out.println(sum);
        }

        // We grab the input from the user which is named input, we then keep a running total which is "sum", we loop from 0 up until the number entered.
        // We then add the current value of i to the total(sum) and return it back after the loop.
        



        //P4: Why does this loop never stop!
        //what can you do to break out of the loop after it prints once?
        System.out.println("Problem 4");
        boolean run = true;
        while (run == true){
            System.out.println("I printed once!");
            break;
        }

        //P5: Take a string from the user and print them the reverse!
        System.out.println("Problem 5");
        String inp = sc.nextLine();
        //hint
        System.out.println("Enter a string: ");
        String word = sc.nextLine();

        String reverse = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reverse += word;

        }
        System.out.println(reverse);
        // We collect a string from the user (word), we create an empty string to build the reversed word.
        // We make i equal to the length of the word and subtract 1 to loop backwords through the string and add the character to the empty string
        // We then print out the variable reverse to give the user their word backwards.
    }


}
