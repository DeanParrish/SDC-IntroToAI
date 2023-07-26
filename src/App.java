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

        //loop through questionset
        for (int i = 0; i < survey.arrQuestion.length; i++) {
            //print question
            System.out.println(survey.arrQuestion[i].text);
            List<String> validAnswers = new ArrayList<String>();
            //append valid answers for quick compairson 
            for (Answer answer : survey.arrQuestion[i].answers) {
                validAnswers.add(answer.optionValue.toLowerCase());
                System.out.println(answer.optionValue + ". " + answer.text);
            }
            Boolean isAnswerValid = false;
            do {
                //capture user input, ensure it is a valid answer
                //if not valid, prompt for valid answer
                String userAnswer = scanner.nextLine().toLowerCase();
                isAnswerValid = validAnswers.contains(userAnswer);
                if (isAnswerValid == false) {
                    System.out.println("Please enter a valid answer...");
                } else if (isAnswerValid = true) {
                    //valid answer, loop through all answers to get point value and party affiliation
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
                            }
                            if (i == 13) {
                                partyAff = answer.text;
                            }
                        }
                    }

                    //wait for sufficient data
                    if (i > 7 && i != 13) {
                        if (republicanScore / totalScore > 0.7) {
                            i = 12; // go to last question
                        }

                        if (democratScore / totalScore > 0.7) {
                            i = 12; // go to last question
                        }

                        if (libertarianScore / totalScore > 0.7) {
                            i = 12; // go to last question
                        }

                        if (greenScore / totalScore > 0.7) {
                            i = 12; // go to last question
                        }
                    }

                }
            } while (isAnswerValid == false);
        }

        //republican chosen, append header that includes: predicted party, chosen party, other party scores
        if (republicanScore > democratScore && republicanScore > libertarianScore && republicanScore > greenScore) {
            headerStr += "Republican predicted \n" +
                    partyAff + " chosen \n" +
                    "Democrat Score: " + democratScore + "\n" +
                    "Green Party Score: " + greenScore + "\n" +
                    "Libertarian Score: " + libertarianScore + "\n\n" +
                    "Question with Answers for party: \n\n";
        }

         //democrat chosen, append header that includes: predicted party, chosen party, other party scores
        if (democratScore > republicanScore && democratScore > libertarianScore && democratScore > greenScore) {
            headerStr += "Democrat predicted \n" +
                    partyAff + " chosen \n" +
                    "Republican Score: " + republicanScore + "\n" +
                    "Green Party Score: " + greenScore + "\n" +
                    "Libertarian Score: " + libertarianScore + "\n\n" +
                    "Question with Answers for party: \n\n";
            ;
        }

         //libertarian chosen, append header that includes: predicted party, chosen party, other party scores
        if (libertarianScore > republicanScore && libertarianScore > democratScore && libertarianScore > greenScore) {
            headerStr += "Libertarian predicted \n" +
                    partyAff + " chosen \n" +
                    "Democrat Score: " + democratScore + "\n" +
                    "Green Party Score: " + greenScore + "\n" +
                    "Rebuplican Score: " + republicanScore + "\n\n" +
                    "Question with Answers for party: \n\n";
            ;
        }

         //green party chosen, append header that includes: predicted party, chosen party, other party scores
        if (greenScore > republicanScore && greenScore > democratScore && greenScore > libertarianScore) {
            headerStr += "Green Party predicted \n" +
                    partyAff + " chosen \n" +
                    "Democrat Score: " + democratScore + "\n" +
                    "Republican Score: " + republicanScore + "\n" +
                    "Libertarian Score: " + libertarianScore + "\n\n" +
                    "Question with Answers for party: \n\n";
        }

        //append headerstring
        republicanStr += headerStr;
        democratStr += headerStr;
        libStr += headerStr;
        greenStr += headerStr;

        //collection question data for each party and append to string to be written
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

        //write strings to the corresponding files
        Path file = Paths.get("bin/outputfiles/republican.txt");
        Files.writeString(file, republicanStr, StandardCharsets.UTF_8);

        file = Paths.get("bin/outputfiles/democrat.txt");
        Files.writeString(file, democratStr, StandardCharsets.UTF_8);

        file = Paths.get("bin/outputfiles/libertarian.txt");
        Files.writeString(file, libStr, StandardCharsets.UTF_8);

        file = Paths.get("bin/outputfiles/green.txt");
        Files.writeString(file, greenStr, StandardCharsets.UTF_8);

    }
}
