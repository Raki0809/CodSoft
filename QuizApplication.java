import java.util.Scanner;

public class QuizApplication {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] questions = {
                "1. Which keyword is used to inherit a class in Java?",
                "2. Which package contains Scanner class?",
                "3. Which method is the entry point of a Java program?",
                "4. Which operator is used for comparison?",
                "5. Which company developed Java?"
        };

        String[][] options = {
                {"A. this", "B. super", "C. extends", "D. implements"},
                {"A. java.io", "B. java.util", "C. java.lang", "D. java.net"},
                {"A. start()", "B. run()", "C. main()", "D. execute()"},
                {"A. =", "B. ==", "C. +", "D. &&"},
                {"A. Microsoft", "B. Google", "C. Sun Microsystems", "D. Apple"}
        };

        char[] answers = {'C', 'B', 'C', 'B', 'C'};

        int score = 0;

        System.out.println("========== JAVA QUIZ ==========");

        for (int i = 0; i < questions.length; i++) {

            System.out.println("\n" + questions[i]);

            for (int j = 0; j < options[i].length; j++) {
                System.out.println(options[i][j]);
            }

            System.out.print("Enter your answer (A/B/C/D): ");
            char userAnswer = Character.toUpperCase(sc.next().charAt(0));

            if (userAnswer == answers[i]) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong!");
                System.out.println("Correct Answer: " + answers[i]);
            }

            System.out.println("--------------------------------");
        }

        System.out.println("\n========== RESULT ==========");
        System.out.println("Total Questions : " + questions.length);
        System.out.println("Correct Answers : " + score);
        System.out.println("Wrong Answers   : " + (questions.length - score));
        System.out.println("Final Score     : " + score + "/" + questions.length);

        if (score == questions.length) {
            System.out.println("Excellent!");
        } else if (score >= 3) {
            System.out.println("Good Job!");
        } else {
            System.out.println("Keep Practicing!");
        }

        sc.close();
    }
}