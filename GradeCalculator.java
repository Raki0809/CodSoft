import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of subjects: ");
        int n = sc.nextInt();

        double[] marks = new double[n];
        double total = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + " (out of 100): ");
            double m = sc.nextDouble();

            // keep asking till valid marks entered
            while (m < 0 || m > 100) {
                System.out.print("Invalid! Enter marks between 0 and 100: ");
                m = sc.nextDouble();
            }

            marks[i] = m;
            total = total + m;
        }

        double avg = total / n;
        String grade;

        // grading logic
        if (avg >= 90)
            grade = "A+";
        else if (avg >= 80)
            grade = "A";
        else if (avg >= 70)
            grade = "B";
        else if (avg >= 60)
            grade = "C";
        else if (avg >= 50)
            grade = "D";
        else
            grade = "F (Fail)";

        System.out.println("\n----- Result -----");
        System.out.println("Total Marks: " + total + " / " + (n * 100));
        System.out.printf("Average: %.2f%%\n", avg);
        System.out.println("Grade: " + grade);

        sc.close();
    }
}