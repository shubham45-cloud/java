import java.util.Scanner;

public class StudentGradeCalculator {

  
    public static String calculateGrade(double averagePercentage) {
        if (averagePercentage >= 90) {
            return "A+";
        } else if (averagePercentage >= 80) {
            return "A";
        } else if (averagePercentage >= 70) {
            return "B";
        } else if (averagePercentage >= 60) {
            return "C";
        } else if (averagePercentage >= 50) {
            return "D";
        } else {
            return "F";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Marks and Grade Calculator!");

        
        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

        double[] marks = new double[numSubjects];
        double totalMarks = 0;

       
        for (int i = 0; i < numSubjects; i++) {
            while (true) {
                System.out.print("Enter the marks obtained in subject " + (i + 1) + " (out of 100): ");
                double mark = scanner.nextDouble();
                if (mark >= 0 && mark <= 100) {
                    marks[i] = mark;
                    totalMarks += mark;
                    break;
                } else {
                    System.out.println("Please enter a valid mark between 0 and 100.");
                }
            }
        }

      
        double averagePercentage = totalMarks / numSubjects;

        
        String grade = calculateGrade(averagePercentage);

      
        System.out.println("\n--- Results ---");
        System.out.println("Total Marks Obtained: " + totalMarks + " out of " + (numSubjects * 100));
        System.out.println("Average Percentage: " + String.format("%.2f", averagePercentage) + "%");
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}


