import java.util.Scanner;

public class Quiz {
    private final Question[] questions;
    private int score;

    public Quiz(Question[] questions) {
        this.questions = questions;
        this.score = 0;
    }

    public void start() {
        Scanner sc = new Scanner(System.in);
        for (Question question : questions) {
            question.display();
            System.out.print("Your answer (1-4): ");
            int answer = sc.nextInt();
            if (question.checkAnswer(answer - 1)) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong!");
            }
        }
        sc.close();
        System.out.println(STR."You scored \{score} out of \{questions.length}");
    }
}
