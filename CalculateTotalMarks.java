import java.util.Scanner;

public class CalculateTotalMarks {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);

        // Get the number of subjects
        System.out.println("Enter the number of subjects: ");
        int numberOfSubjects = sc.nextInt();

        // Create an array to store the marks obtained in each subject
        int[] marks = new int[numberOfSubjects];

        // Get the marks obtained in each subject and validate that they are less than 100
        for (int i = 0; i < numberOfSubjects; i++) {
            System.out.println("Enter the marks obtained in subject " + (i + 1) + ": ");
            int mark = sc.nextInt();

            // Validate that the mark is less than 100
            if (mark > 100) {
                System.out.println("Invalid mark. Marks should be less than 100.");
                i--; // Decrement the loop counter to get the user to enter the mark again
                continue;
            }

            marks[i] = mark;
        }

        // Calculate the total marks
        int totalMarks = 0;
        for (int mark : marks) {
            totalMarks += mark;
        }

        // Calculate the average percentage
        float averagePercentage = (float) totalMarks / numberOfSubjects;

        // Calculate the grade
        String grade;
        if (averagePercentage >= 90) {
            grade = "A";
        } else if (averagePercentage >= 80) {
            grade = "B";
        } else if (averagePercentage >= 70) {
            grade = "C";
        } else if (averagePercentage >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }

        // Display the results
        System.out.println("Total marks: " + totalMarks);
        System.out.println("Average percentage: " + averagePercentage);
        System.out.println("Grade: " + grade);

        // Close the Scanner object
        sc.close();
        
    }
}
