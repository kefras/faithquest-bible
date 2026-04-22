public class Question {
    private String questionText;
    private String[] options;
    private String hint;
    private String correctAnswer;

    public Question(String questionText, String[] options, String hint, String correctAnswer) {
        this.questionText = questionText;
        this.options = options;
        this.hint = hint;
        this.correctAnswer = correctAnswer;
    }

    public boolean validateAnswer(String answer) {
        return correctAnswer.equals(answer);
    }

    // Getters and additional methods can be added here
}