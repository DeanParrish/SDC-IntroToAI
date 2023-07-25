import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        double republicanScore = 0, democratScore = 0, libertarianScore = 0, greenScore = 0;

        PartySurvey survey = new PartySurvey();
        Scanner scanner = new Scanner(System.in);

        for (Question question : survey.arrQuestion) {
            System.out.println(question.text);
            List<String> validAnswers = new ArrayList<String>();
            for (Answer answer : question.answers) {
                validAnswers.add(answer.optionValue.toLowerCase());
                System.out.println(answer.optionValue + ". " + answer.text);
            }
            Boolean isAnswerValid = false;
            do {
                String userAnswer = scanner.nextLine().toLowerCase();
                isAnswerValid = validAnswers.contains(userAnswer);
                if (isAnswerValid == false) {
                    System.out.println("Please enter a valid answer...");
                } else if (isAnswerValid = true) {
                    for (Answer answer : question.answers) {
                        if (answer.optionValue.toLowerCase() == userAnswer) {
                            for (PoliticalParty party : answer.party) {
                                switch (party) {
                                    case Republican:
                                        republicanScore += question.pointValue;
                                        break;
                                    case Democrat:
                                        democratScore += question.pointValue;
                                        break;
                                    case Green:
                                        greenScore += question.pointValue;
                                        break;
                                    case Libertarian:
                                        libertarianScore += question.pointValue;
                                        break;
                                }
                            }
                        }
                    }
                }
            } while (isAnswerValid == false);
        }

         System.out.println("R Score: " + republicanScore);
         System.out.println("D Score: " + democratScore);
         System.out.println("L Score: " + libertarianScore);
         System.out.println("G Score: " + greenScore);

    }
}
