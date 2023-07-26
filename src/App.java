import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        double republicanScore = 0, democratScore = 0, libertarianScore = 0, greenScore = 0, totalScore = 0;
        String republicanStr = "", democratStr = "", libStr = "", greenStr = "", headerStr = "", partyAff = "";

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
                                if (i == 14) {
                                    partyAff = survey.arrQuestion[i].text;
                                }
                                break;
                            }
                        }
                    }

                    if (i > 7 && i != 14) {
                        if (republicanScore / totalScore > 0.7) {
                            System.out.println("Republican Likely");
                            i = 13; // go to last question
                        }

                        if (democratScore / totalScore > 0.7) {
                            System.out.println("Democrat Likely");
                            i = 13; // go to last question
                        }

                        if (libertarianScore / totalScore > 0.7) {
                            System.out.println("Libertarian Likely");
                            i = 13; // go to last question
                        }

                        if (greenScore / totalScore > 0.7) {
                            System.out.println("Green Party Likely");
                            i = 13; // go to last question
                        }
                    }

                }
            } while (isAnswerValid == false);
        }

        if (republicanScore > democratScore && republicanScore > libertarianScore && republicanScore > greenScore) {
            headerStr += "Republican predicted \n" +
                    partyAff + " chosen \n" +
                    "Democrat Score: " + democratScore + "\n" +
                    "Green Party Score: " + greenScore + "\n" +
                    "Libertarian Score: " + libertarianScore + "\n\n" +
                    "Question with Answers for party: \n\n";
        }

        if (democratScore > republicanScore && democratScore > libertarianScore && democratScore > greenScore) {
            headerStr += "Democrat predicted \n" +
                    partyAff + " chosen \n" +
                    "Republican Score: " + republicanScore + "\n" +
                    "Green Party Score: " + greenScore + "\n" +
                    "Libertarian Score: " + libertarianScore + "\n\n" +
                    "Question with Answers for party: \n\n";
            ;
        }

        if (libertarianScore > republicanScore && libertarianScore > democratScore && libertarianScore > greenScore) {
            headerStr += "Libertarian predicted \n" +
                    partyAff + " chosen \n" +
                    "Democrat Score: " + democratScore + "\n" +
                    "Green Party Score: " + greenScore + "\n" +
                    "Rebuplican Score: " + republicanScore + "\n\n" +
                    "Question with Answers for party: \n\n";
            ;
        }

        if (greenScore > republicanScore && greenScore > democratScore && greenScore > libertarianScore) {
            headerStr += "Green Party predicted \n" +
                    partyAff + " chosen \n" +
                    "Democrat Score: " + democratScore + "\n" +
                    "Republican Score: " + republicanScore + "\n" +
                    "Libertarian Score: " + libertarianScore + "\n\n" +
                    "Question with Answers for party: \n\n";
        }

        republicanStr += headerStr;
        democratStr += headerStr;
        libStr += headerStr;
        greenStr += headerStr;

        for (Question ques : survey.arrQuestion) {
            if (ques.answerSelected != null) {
                // if question has political affiliation, append to string
                for (PoliticalParty party : ques.answerSelected.party) {
                    if (party.equals(PoliticalParty.Republican)) {
                        republicanStr += "Question: " + ques.text + "\n" +
                                "Answer: " + ques.answerSelected.text + "\n\n";
                    }

                    if (party.equals(PoliticalParty.Democrat)) {
                        democratStr += "Question: " + ques.text + "\n" +
                                "Answer: " + ques.answerSelected.text + "\n\n";
                    }

                    if (party.equals(PoliticalParty.Libertarian)) {
                        libStr += "Question: " + ques.text + "\n" +
                                "Answer: " + ques.answerSelected.text + "\n\n";
                    }

                    if (party.equals(PoliticalParty.Green)) {
                        greenStr += "Question: " + ques.text + "\n" +
                                "Answer: " + ques.answerSelected.text + "\n\n";
                    }
                }
            }
        }

        Path file = Paths.get("bin/outputfiles/republican.txt");
        Files.writeString(file, republicanStr, StandardCharsets.UTF_8);

        file = Paths.get("bin/outputfiles/democrat.txt");
        Files.writeString(file, democratStr, StandardCharsets.UTF_8);

        file = Paths.get("bin/outputfiles/libertarian.txt");
        Files.writeString(file, libStr, StandardCharsets.UTF_8);

        file = Paths.get("bin/outputfiles/green.txt");
        Files.writeString(file, greenStr, StandardCharsets.UTF_8);

        System.out.println("R Score: " + republicanScore);
        System.out.println("D Score: " + democratScore);
        System.out.println("L Score: " + libertarianScore);
        System.out.println("G Score: " + greenScore);

    }
}
