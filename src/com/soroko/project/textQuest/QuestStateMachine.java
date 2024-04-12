package com.soroko.project.textQuest;

import java.io.Serializable;

public enum QuestStateMachine implements Serializable {

    Introduction {
        @Override
        public QuestStateMachine firstState() {
            return HappyEnd;
        }

        @Override
        public QuestStateMachine secondState() {
            return TryToSearch;
        }

        @Override
        public void textOfParagraph() {
            System.out.println(Constants.INTRODUCTION);
        }
    },
    HappyEnd {
        @Override
        public QuestStateMachine firstState() {
            return this;
        }

        @Override
        public QuestStateMachine secondState() {
            return this;
        }

        @Override
        public void textOfParagraph() {
            System.out.println(Constants.HAPPY_END);
            System.exit(0);
        }
    },
    TryToSearch {
        @Override
        public QuestStateMachine firstState() {
            return TryToAskLocals;
        }

        @Override
        public QuestStateMachine secondState() {
            return UnhappyEndSearch;
        }

        @Override
        public void textOfParagraph() {
            System.out.println(Constants.TRY_TO_SEARCH);
        }
    },
    TryToAskLocals {
        @Override
        public QuestStateMachine firstState() {
            return TryToAskTheOwl;
        }

        @Override
        public QuestStateMachine secondState() {
            return TryToAskTheWolf;
        }

        @Override
        public void textOfParagraph() {
            System.out.println(Constants.TRY_TO_ASK_LOCALS);
        }
    },
    UnhappyEndSearch {
        @Override
        public QuestStateMachine firstState() {
            return this;
        }

        @Override
        public QuestStateMachine secondState() {
            return this;
        }

        @Override
        public void textOfParagraph() {
            System.out.println(Constants.UNHAPPY_END_SEARCH);
            System.exit(0);
        }
    },
    TryToAskTheOwl {
        @Override
        public QuestStateMachine firstState() {
            return TrustTheOwl;
        }

        @Override
        public QuestStateMachine secondState() {
            return UnhappyEndSearch;
        }

        @Override
        public void textOfParagraph() {
            System.out.println(Constants.TRY_TO_ASK_THE_OWL);
        }
    },
    TryToAskTheWolf {
        @Override
        public QuestStateMachine firstState() {
            return HappyEnd;
        }

        @Override
        public QuestStateMachine secondState() {
            return UnhappyEndSearch;
        }

        @Override
        public void textOfParagraph() {
            System.out.println(Constants.TRY_TO_ASK_THE_WOLF);
        }
    },
    TrustTheOwl {
        @Override
        public QuestStateMachine firstState() {
            return UnhappyEndSearch;
        }

        @Override
        public QuestStateMachine secondState() {
            return FindTheHoney;
        }

        @Override
        public void textOfParagraph() {
            System.out.println(Constants.TRUST_THE_OWL);
        }
    },
    FindTheHoney {
        @Override
        public QuestStateMachine firstState() {
            return WaitForTheBees;
        }

        @Override
        public QuestStateMachine secondState() {
            return UnhappyEndSteal;
        }

        @Override
        public void textOfParagraph() {
            System.out.println(Constants.FIND_THE_HONEY);
        }
    },
    WaitForTheBees {
        @Override
        public QuestStateMachine firstState() {
            return UnhappyEndRest;
        }

        @Override
        public QuestStateMachine secondState() {
            return BringTheHoneyToTheBear;
        }

        @Override
        public void textOfParagraph() {
            System.out.println(Constants.WAIT_FOR_THE_BEES);
        }
    },
    UnhappyEndRest {
        @Override
        public QuestStateMachine firstState() {
            return this;
        }

        @Override
        public QuestStateMachine secondState() {
            return this;
        }

        @Override
        public void textOfParagraph() {
            System.out.println(Constants.UNHAPPY_END_REST);
            System.exit(0);
        }
    },
    UnhappyEndSteal {
        @Override
        public QuestStateMachine firstState() {
            return this;
        }

        @Override
        public QuestStateMachine secondState() {
            return this;
        }

        @Override
        public void textOfParagraph() {
            System.out.println(Constants.UNHAPPY_END_STEAL);
            System.exit(0);
        }
    },
    BringTheHoneyToTheBear {
        @Override
        public QuestStateMachine firstState() {
            return UnhappyEndSearch;
        }

        @Override
        public QuestStateMachine secondState() {
            return HappyEnd;
        }

        @Override
        public void textOfParagraph() {
            System.out.println(Constants.BRING_THE_HONEY_TO_THE_BEAR);
        }
    };

    public abstract QuestStateMachine firstState();

    public abstract QuestStateMachine secondState();

    public abstract void textOfParagraph();
}
