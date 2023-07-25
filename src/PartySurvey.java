
public class PartySurvey {
    public Question[] arrQuestion = {
            new Question() {
                {
                    text = "What should the government do to help the poor?";
                    pointValue = 2;
                    answers = new Answer[] {
                            new Answer("Make it easier to apply for assistance", "A",
                                    new PoliticalParty[] { PoliticalParty.Democrat }),
                            new Answer("Allow parents to use education funds for charter schools", "B",
                                    new PoliticalParty[] { PoliticalParty.Republican }),
                            new Answer("Create welfare to work programs", "C",
                                    new PoliticalParty[] { PoliticalParty.Green }),
                            new Answer("Nothing", "D", new PoliticalParty[] { PoliticalParty.Libertarian }),
                    };
                }
            },
            new Question() {
                {
                    text = "What should be done about the state of healthcare?";
                    pointValue = 2;
                    answers = new Answer[] {
                            new Answer("Implement universal healthcare", "A",
                                    new PoliticalParty[] { PoliticalParty.Democrat }),
                            new Answer("Allow people the ability to find their own healthcare", "B",
                                    new PoliticalParty[] { PoliticalParty.Republican }),
                            new Answer("Create initiaives to trade environment improving for healthcare", "C",
                                    new PoliticalParty[] { PoliticalParty.Green }),
                            new Answer("Take no government action", "D",
                                    new PoliticalParty[] { PoliticalParty.Libertarian }),
                    };
                }
            },
            new Question() {
                {
                    text = "What is your stance on abortion?";
                    pointValue = 1;
                    answers = new Answer[] {
                            new Answer("Leave it up to the person", "A",
                                    new PoliticalParty[] { PoliticalParty.Democrat, PoliticalParty.Green,
                                            PoliticalParty.Libertarian }),
                            new Answer("Ban it", "B", new PoliticalParty[] { PoliticalParty.Republican }),
                    };
                }
            },
            new Question() {
                {
                    text = "How should the national debt be handled?";
                    pointValue = 3;
                    answers = new Answer[] {
                            new Answer("Increase Taxes on high earners", "A",
                                    new PoliticalParty[] { PoliticalParty.Democrat }),
                            new Answer("Decrease social programs", "B",
                                    new PoliticalParty[] { PoliticalParty.Republican }),
                            new Answer("Inventivize green processes for the overall good", "C",
                                    new PoliticalParty[] { PoliticalParty.Green }),
                            new Answer("Drastic cuts to social programs and government duties", "D",
                                    new PoliticalParty[] { PoliticalParty.Libertarian }),
                    };
                }
            },
            new Question() {
                {
                    text = "What are your opinions on military spending?";
                    pointValue = 2.75;
                    answers = new Answer[] {
                            new Answer("It needs to be decreased", "A",
                                    new PoliticalParty[] { PoliticalParty.Democrat }),
                            new Answer("Increase it", "B", new PoliticalParty[] { PoliticalParty.Republican }),
                            new Answer("Are there any ways to make processes more environmentally friendly?", "C",
                                    new PoliticalParty[] { PoliticalParty.Green }),
                            new Answer("Increase only for defense purposes, otherwise cut it", "D",
                                    new PoliticalParty[] { PoliticalParty.Libertarian }),
                    };
                }
            },
            new Question() {
                {
                    text = "Should the government regulate everything?";
                    pointValue = 1.9;
                    answers = new Answer[] {
                            new Answer("Yes to protect the people", "A",
                                    new PoliticalParty[] { PoliticalParty.Democrat }),
                            new Answer("No it will hinder the free market", "B",
                                    new PoliticalParty[] { PoliticalParty.Republican }),
                            new Answer("Only if it enacts more environemntally friendly options", "C",
                                    new PoliticalParty[] { PoliticalParty.Green }),
                            new Answer("The government should stay out", "D",
                                    new PoliticalParty[] { PoliticalParty.Libertarian }),
                    };
                }
            },
            new Question() {
                {
                    text = "Should things be done for the good of humanity or for the good of one's self";
                    pointValue = 1.5;
                    answers = new Answer[] {
                            new Answer("Greater Good", "A",
                                    new PoliticalParty[] { PoliticalParty.Democrat, PoliticalParty.Green }),
                            new Answer("One's Self", "B",
                                    new PoliticalParty[] { PoliticalParty.Republican, PoliticalParty.Libertarian }),
                    };
                }
            },
            new Question() {
                {
                    text = "How do you feel about gun control?";
                    pointValue = 2.5;
                    answers = new Answer[] {
                            new Answer("It should be more strict", "A",
                                    new PoliticalParty[] { PoliticalParty.Democrat, PoliticalParty.Green }),
                            new Answer("Tighter laws will inpede individual rights", "B",
                                    new PoliticalParty[] { PoliticalParty.Republican }),
                            new Answer("The government should not control anything", "C",
                                    new PoliticalParty[] { PoliticalParty.Libertarian }),
                    };
                }
            },
            new Question() {
                {
                    text = "What is your opinion on climate change?";
                    pointValue = 2;
                    answers = new Answer[] {
                            new Answer("Actions need to be taken to reduce the effects", "A",
                                    new PoliticalParty[] { PoliticalParty.Democrat }),
                            new Answer("The world has been heating and cooling for centuries", "B",
                                    new PoliticalParty[] { PoliticalParty.Republican }),
                            new Answer("It is REAL and NEEDS to be corrected NOW", "C",
                                    new PoliticalParty[] { PoliticalParty.Green }),
                            new Answer("It sounds like another regulation vehicle. No thanks.", "D",
                                    new PoliticalParty[] { PoliticalParty.Libertarian }),
                    };
                }
            },
            new Question() {
                {
                    text = "Should the minimum wage be raised?";
                    pointValue = 1.5;
                    answers = new Answer[] {
                            new Answer("Yes!", "A",
                                    new PoliticalParty[] { PoliticalParty.Democrat, PoliticalParty.Green }),
                            new Answer("No, the free market will set the minimum wage", "B",
                                    new PoliticalParty[] { PoliticalParty.Republican, PoliticalParty.Libertarian }),
                    };
                }
            },
            new Question() {
                {
                    text = "Should there be more progressive taxes or a flat tax?";
                    pointValue = 2;
                    answers = new Answer[] {
                            new Answer("Progressive tax", "A",
                                    new PoliticalParty[] { PoliticalParty.Democrat, PoliticalParty.Green }),
                            new Answer("Flat tax", "B",
                                    new PoliticalParty[] { PoliticalParty.Republican }),
                            new Answer("No taxes", "C",
                                    new PoliticalParty[] { PoliticalParty.Libertarian }),
                    };
                }
            },
             new Question() {
                {
                    text = "Should Medicare be expanded?";
                    pointValue = 2;
                    answers = new Answer[] {
                            new Answer("Yes", "A",
                                    new PoliticalParty[] { PoliticalParty.Democrat, PoliticalParty.Green }),
                            new Answer("No", "B",
                                    new PoliticalParty[] { PoliticalParty.Republican }),
                            new Answer("No, I don't want to pay the extra taxes", "C",
                                    new PoliticalParty[] { PoliticalParty.Libertarian }),
                    };
                }
            },
            new Question() {
                {
                    text = "Who should be president?";
                    pointValue = 2.5;
                    answers = new Answer[] {
                            new Answer("Bernie Sanders", "A", new PoliticalParty[] { PoliticalParty.Democrat }),
                            new Answer("Donald Trump", "B", new PoliticalParty[] { PoliticalParty.Republican }),
                            new Answer("Jo Jorgensen", "C", new PoliticalParty[] { PoliticalParty.Libertarian }),
                            new Answer("Howie Hawkins", "D", new PoliticalParty[] { PoliticalParty.Green }),
                    };
                }
            },
            new Question() {
                {
                    text = "Who is your party affiliation";
                    pointValue = 0;
                    answers = new Answer[] {
                            new Answer("Democrat", "A", new PoliticalParty[] { PoliticalParty.Democrat }),
                            new Answer("Republican", "B", new PoliticalParty[] { PoliticalParty.Republican }),
                            new Answer("Libertarian", "C", new PoliticalParty[] { PoliticalParty.Libertarian }),
                            new Answer("Green Party", "D", new PoliticalParty[] { PoliticalParty.Green }),
                    };
                }

            },
    };

}
