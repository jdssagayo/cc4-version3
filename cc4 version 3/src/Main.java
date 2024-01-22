import java.util.Scanner;

public class Main {

    public static int counter = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Weekly Routine Algorithm");

        // Step 0: Initialize counter for time complexity
        int timeComplexityCounter = 0;

        // Step 1: Get the number of days in the week
        int numDays = 6; // Adjusted to have a time complexity of 60

        // Step 2: Loop through each day of the week
        for (int day = 1; day <= numDays; day++) {
            System.out.println("\nDay " + day + ":");

            // Step 3: Wake up
            System.out.println("Step 1: Wake up");
            counter++;

            // Step 4: Take a Bath or use Perfume
            System.out.print("Step 2: Take a Bath? (yes/no): ");
            String bathChoice = scanner.nextLine();
            counter++;

            if ("yes".equalsIgnoreCase(bathChoice)) {
                System.out.println("You chose to take a bath.");
            } else if ("no".equalsIgnoreCase(bathChoice)) {
                System.out.println("You chose not to take a bath. Consider using perfume.");
            } else {
                System.out.println("Invalid choice. Please enter 'yes' or 'no'.");
            }

            // Step 5: Brush Teeth
            System.out.println("Step 3: Brush my Teeth");
            counter++;

            // Step 6: Change clothes and check the temperature
            System.out.print("Step 4: Enter the current temperature in Celsius: ");
            double temperature = scanner.nextDouble();
            counter++;

            // Check if the temperature is between 15 and 23 degrees
            if (temperature <= 23) {
                System.out.println("It's cold, I will wear a jacket.");
            } else {
                System.out.println("It's not too cold, I might not need to wear a jacket.");
            }

            // Step 7: Prepare things for school
            System.out.println("Step 5: Prepare things for school");
            counter++;

            // Step 8: Find a ride
            System.out.println("Step 6: Find a ride");
            counter++;

            // Consume the newline character
            scanner.nextLine();

            // Step 9.1: Choose transportation using a for loop
            for (int attempt = 1; attempt <= 3; attempt++) {
                System.out.print("Attempt " + attempt + ": Choose transportation (jeep/taxi): ");
                String transportChoice = scanner.nextLine();
                counter++;

                // Step 9.2: Calculate and display cost
                if ("jeep".equalsIgnoreCase(transportChoice)) {
                    System.out.println("You chose to ride a jeep. Cost: -10 pesos.");
                    break; // Exit the loop if a valid choice is made
                } else if ("taxi".equalsIgnoreCase(transportChoice)) {
                    System.out.println("You chose to ride a taxi. Cost: -180 pesos.");
                    break; // Exit the loop if a valid choice is made
                } else {
                    System.out.println("Invalid choice. Please enter 'jeep' or 'taxi'.");
                }
            }

            // Step 10: Enter UC
            System.out.println("Step 7: Enter UC");
            counter++;

            // Increment the time complexity counter
            timeComplexityCounter++;

            // Step 11: After First Period, Eat
            System.out.println("Step 8: After First Period, Eat");
            counter++;

            // Additional Step 12: Go Back to School
            System.out.println("Step 9: Go Back to School");
            counter++;

            // Additional Loop with Increment
            System.out.println("Additional Loop:");

            // Step 13: Additional Loop
            for (int i = 1; i <= 3; i++) {
                System.out.println("Iteration " + i + ": Perform an additional action");
                counter++;
            }
        }

        // Display overall time complexity
        System.out.println("\nOverall time complexity: " + timeComplexityCounter);

        // Display the counter
        System.out.println("Number of semicolons: " + counter);

        // Closing the scanner to avoid resource leaks
        scanner.close();
    }
}
