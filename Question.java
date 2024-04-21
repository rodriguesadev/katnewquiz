public class Question {
    private String questionText;
    private String[] options;
    private int correctAnswerIndex;

    public Question (String questionText, String[] options, int correctAnswerIndex) {
        this.questionText = questionText;
        this.options = options;
        this.correctAnswerIndex = correctAnswerIndex;
    }

    public boolean checkAnswer (int userAnswer) {
        return userAnswer == correctAnswerIndex;
    }

    public void display () {
        System.out.println(questionText);
        for (int i = 0; i < options.length; i++) {
            System.out.println(STR."\{i + 1}. \{options[i]}");
        }
    }
}
