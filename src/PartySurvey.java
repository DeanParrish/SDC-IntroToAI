
public class PartySurvey {
    public Question[] arrQuestion = {
        new Question() {
            {
                text = "What should the government do to help the poor?";
                pointValue = 2;
                answers = new Answer[] {
                    new Answer("Make it easier to apply for assistance", "A", new PoliticalParty[] {PoliticalParty.Democrat}),
                    new Answer("Allow parents to use education funds for charter schools", "B", new PoliticalParty[] {PoliticalParty.Republican}),
                    new Answer("Create welfare to work programs", "C", new PoliticalParty[] {PoliticalParty.Green}),
                    new Answer("Nothing", "D", new PoliticalParty[] {PoliticalParty.Libertarian}),
                };
            }  
        },
        new Question() {
            {
                text = "What should be done about the state of healthcare?";
                pointValue = 2;
                answers = new Answer[] {
                    new Answer("Implement universal healthcare", "A", new PoliticalParty[] {PoliticalParty.Democrat}),
                    new Answer("Allow people the ability to find their own healthcare", "B", new PoliticalParty[] {PoliticalParty.Republican}),
                    new Answer("Create initiaives to trade environment improving for healthcare", "C", new PoliticalParty[] {PoliticalParty.Green}),
                    new Answer("Take no government action", "D", new PoliticalParty[] {PoliticalParty.Libertarian}),
                };
            }
        },
        new Question() {
            {
                text = "What is your stance on abortion?";
                pointValue = 1;
                answers = new Answer[] {
                    new Answer("Leave it up to the person", "A", new PoliticalParty[] {PoliticalParty.Democrat, PoliticalParty.Green, PoliticalParty.Libertarian}),
                    new Answer("Ban it", "B", new PoliticalParty[] {PoliticalParty.Republican}),
                };
            }
        },
        new Question() {
            {
                text = "Who should be president?";
                pointValue = 2.5;
                answers = new Answer[] {
                    new Answer("Bernie Sanders", "A", new PoliticalParty[] {PoliticalParty.Democrat}),
                    new Answer("Donald Trump", "B", new PoliticalParty[] {PoliticalParty.Republican}),
                    new Answer("Jo Jorgensen", "C", new PoliticalParty[] {PoliticalParty.Libertarian}),
                    new Answer("Howie Hawkins", "C", new PoliticalParty[] {PoliticalParty.Green}),
                };
            } 
        },
        new Question() {
            {
                text = "Who is your party affiliation";
                pointValue = 0;
                answers = new Answer[] {
                    new Answer("Democrat", "A", new PoliticalParty[] {PoliticalParty.Democrat}),
                    new Answer("Republican", "B", new PoliticalParty[] {PoliticalParty.Republican}),
                    new Answer("Libertarian", "B", new PoliticalParty[] {PoliticalParty.Libertarian}),
                    new Answer("Green Party", "B", new PoliticalParty[] {PoliticalParty.Green}),
                };
            }
            
            
        },
    };

}
