public class App {
    public static void main(String[] args) throws Exception {
        int[] myArray = {10,3,295,38,20,3,4,267,2445,10,5566,87,93,17,10,2,87,267,3167,3,82};

        System.out.println("Duplicates:");
        // running a loop to go through the list to find duplicates
        for (int i = 0; i < myArray.length; i++) {
            // if we have printed a number or found a number already we don't print it.
            boolean alreadyFound = false;
            for (int k = 0; k <i; k++) {
                if (myArray[i] == myArray[k]) {
                    alreadyFound = true;
                    break;
                }
            }
            if (alreadyFound) {
                for (int j = i + 1; j < myArray.length; j++) {
                // we use this nested loop so we don't compare a value with itself.
                    if (myArray[i] == myArray[j]) {
                        System.out.println(myArray[i]);
                    // printing out the duplicates
                        break;
                    }
                }
            }
        }
        System.out.println("Counting Occurences: ");
        for (int i = 0; i < myArray.length; i++) {
            int count = 1;
            boolean alreadyCounted = false;
            // making sure we don't count occurences that have already been counted
            for (int k = 0; k < i; k++) {
                if (myArray[i] == myArray[k]) {
                    alreadyCounted = true;
                    break;
                }
            }
            // counting the occurences
            for (int j = i + 1; j < myArray.length; j++) {
                if (myArray[i] == myArray[j]) {
                    count++;
                }
            }
            // If we have already counted the number of occurences for this number move on !!
            if (alreadyCounted) {
                continue;
            }
            // printing out the statement that tells us how many times a number is in the array.
            if (count > 1) {
                System.out.println(myArray[i] + " occurs " + count + " times.");
            }
        }
        
        System.out.println("In this exercise I learned that in order to make a fast and smooth program, using nested loops will help a lot");
        System.out.println("I also learned that you need to always have a block of line that checks if a certain condition has already been met or counted (in this case)");

    }
}
