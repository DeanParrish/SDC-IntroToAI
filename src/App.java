import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        double republicanScore = 0, democratScore = 0, libertarianScore = 0, greenScore = 0, totalScore = 0;

        PartySurvey survey = new PartySurvey();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < survey.arrQuestion.length; i++) {
            System.out.println(survey.arrQuestion[i].text);
            List<String> validAnswers = new ArrayList<String>();
            for (Answer answer : survey.arrQuestion[i].answers) {
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
                    for (Answer answer : survey.arrQuestion[i].answers) {
                        if (answer.optionValue.toLowerCase().equals(userAnswer)) {
                            survey.arrQuestion[i].answerSelected = answer;
                            for (PoliticalParty party : answer.party) {
                                switch (party) {
                                    case Republican:
                                        republicanScore += survey.arrQuestion[i].pointValue;
                                        break;
                                    case Democrat:
                                        democratScore += survey.arrQuestion[i].pointValue;
                                        break;
                                    case Green:
                                        greenScore += survey.arrQuestion[i].pointValue;
                                        break;
                                    case Libertarian:
                                        libertarianScore += survey.arrQuestion[i].pointValue;
                                        break;
                                }

                                totalScore += survey.arrQuestion[i].pointValue;
                                break;
                            }
                        }
                    }

                    if (i > 7) {
                        if (republicanScore/totalScore > 0.7) {
                            System.out.println("Republican Likely");
                        }

                        if (democratScore/totalScore > 0.7) {
                            System.out.println("Democrat Likely");
                        }

                        if (libertarianScore/totalScore > 0.7) {
                            System.out.println("Libertarian Likely");
                        }

                        if (greenScore/totalScore > 0.7) {
                            System.out.println("Green Party Likely");
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
