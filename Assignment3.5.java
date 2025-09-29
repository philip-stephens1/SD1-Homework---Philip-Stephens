
import java.util.Scanner;
class Debug {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Getting user input on yearly salary.
        System.out.println("Enter your yearly salary");
        int salary = sc.nextInt();
        // Getting user input on yearly expenses.
        System.out.println("Enter your yearly expenses");
        int expenses = sc.nextInt();
        // Getting user input on how many people in household.
        System.out.println("Enter the amount of people in your household");
        int people = sc.nextInt();

        int additionalTaxReduction = 0;
        // We use additionalTaxReduction to store an extra tax reduction based on the number of people
        for(int i = 0; i <= people; i++){
            additionalTaxReduction += 2;
        }
        // In this section we are running a loop from 0 up to the number of people in the housae hold. For each iteration we increase by 2,
        int taxReduction = 0;
        taxReduction += additionalTaxReduction;
        // We add taxReduction to additionalTaxReduction to get the total tax reduction.
        if(salary > 50000 && people > 3){
        // checking if the given salary is above $50,000 and if there are more than 3 people.
        // if true we add on an extra 10% of reduction
            taxReduction += 10;
            System.out.println("You get a " + taxReduction+ "% reduction on taxes.");
        } else if(salary > 30000 && people > 4){
        //checking if the salary is more than 30,000 and there are more than 4 people.
        // If true we add extra 9% of reduction.
            taxReduction += 9;
            System.out.println("You get a " + taxReduction+ "% reduction on taxes.");
        } else if(salary > 70000 && people > 2){
        // checking if the salary is more than 70,000 and if there are more than 2 people.
        // if true we had on an extra 5%.
            taxReduction += 5;
            System.out.println("You get a " + taxReduction+ "% reduction on taxes.");
        } else {
        // if none of these conditions are met we print out that there are no applicable reductions on taxes found for the person.
            System.out.println("No applicable reduction on taxes found.");
        }

    }
}
