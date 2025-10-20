import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
      Scanner sc = new Scanner(System.in);
// "list of cases" not list of values just numbers 1 through 26!
      ArrayList<Integer> cases = new ArrayList<>();
      for (int i = 1; i <= 26; i++) {
        cases.add(i);
      }
// our actual list of values in the case
      ArrayList<Double> values = new ArrayList<>(Arrays.asList(
        0.01, 1.0, 5.0, 10.0, 25.0, 50.0, 75.0, 100.0,
        200.0, 300.0, 400.0, 500.0, 750.0, 1000.0, 5000.0,
        10000.0, 25000.0, 50000.0, 75000.0, 100000.0,
        200000.0, 300000.0, 400000.0, 500000.0, 750000.0, 1000000.0));
      Collections.shuffle(values);

      System.out.println("Welcome to the gameshow Deal or No Deal");
      System.out.println("Pick a case from numbers 1 to 26");
      int playerCase = sc.nextInt();
// we take that list of values for the cases, take the input we gathered and remove it from our case list
      double PlayerCaseAmount = values.get(playerCase - 1);
      cases.remove(Integer.valueOf(playerCase));

      boolean deal = false;
// telling the user which cases are left and giving them a list of cases to choose
      while (deal == false && cases.size() > 1) {
        System.out.println("Cases left are: " + cases);
        System.out.println("Pick a case to open next ");
        int caseChosen = sc.nextInt();
// checking if a case was chosen or the user gave us a bad numner
        boolean allowed = false;
        while (allowed == false) {
            if (cases.contains(caseChosen)) {
                allowed = true;
            } else {
                System.out.println("Case was already chosen or doesn't exist pick again.");
                caseChosen = sc.nextInt();
            }
        }
    
// User selects the case number and reads the value of the selected case
        double openedCase = values.get(caseChosen - 1);
        System.out.println("In case " + caseChosen + " it is worth: " + openedCase);
        cases.remove(Integer.valueOf(caseChosen));
// for every 5th case we strike a deal to the user
        if ( cases.size() % 5 == 0) {
            double offer = dealerOffer(values, cases); // bringing in that method we made below
            System.out.println("The banker offers you: " + offer);
            System.out.println("Deal or No Deal?");
            String choice = sc.nextLine();
// taking the deal or not taking the deal
            if (choice == "deal") {
                System.out.println("You took the " + offer + " deal, congrats!");
                deal = true;
            } else {
                System.out.println("No deal accepted.");
            }

        }

      
// towards the end of the game if the user decides to take no deals
      if (deal == false) {
        System.out.println("Your case chosen contains...");
        System.out.println(PlayerCaseAmount + "!");
      } else {
        System.out.println("Thanks for playing!");
      }
    }
}

// setting up a method to use for the offers to make it a more easier and fluent code in the main
    public static double dealerOffer(ArrayList<Double> values, ArrayList<Integer> cases) {
        double total = 0;
        for (int i = 0; i < cases.size(); i++) {
            int index = cases.get(i)-1;
            total += values.get(index);
        }
        return total/cases.size();
    }
}



// had to definitely search a good amount of outside info to complete this
// i use double because I kept getting errors for my lists because of the compact issues or whatnot
