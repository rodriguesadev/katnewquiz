public class Main {
    public static void main(String[] args) {

        Question[] questions = {
                new Question("What film marked Kathryn Newton's debut as a lead actress?",
                        new String[]{"Paranormal Activity 4", "Bad Teacher", "Lady Bird", "The Society"}, 0),
                new Question("In which series did Kathryn Newton play a prominent role in 2019?",
                        new String[]{"The Society", "Big Little Lies", "Both", "None"}, 2),
                new Question("What song does Kathryn Newton sing in the movie 'Lisa Frankenstein' while 'The Creature' is playing the piano?",
                        new String[]{"Every Breath You Take", "Total Eclipse of the Heart", "I Can't Fight This Feeling", "Livin' on a Prayer"}, 2),
                new Question("What color is Kathryn Newton's jacket in the movie 'Freaky'?",
                        new String[]{"Blue", "Green", "Red", "Black"}, 2),
                new Question("In the movie 'The Map of Tiny Perfect Things,' what skill is Kathryn Newton's character teaching herself?",
                        new String[] {"How to drive", "How to swim", "How to cook", "How to pain"}, 0)
        };

        Quiz quiz = new Quiz(questions);
        quiz.start();
    }
}