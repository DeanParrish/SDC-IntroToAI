public class Answer {
    String text;
    String optionValue;
    PoliticalParty[] party;

    public Answer(String text, String optionValue, PoliticalParty[] party){
        this.text = text;
        this.optionValue = optionValue;
        this.party = party;
    }
}
