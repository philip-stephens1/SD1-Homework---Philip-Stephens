import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How old are you? ");

        String age = sc.nextLine();
        System.out.println("You are " + age + " years old!");

        int num1 = 10;
        int num2 = 37;
        int sum = num1+num2;
        System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum + ".");


    }
}
