package com.soroko.project.textQuest;

public enum Paragraph {

    FirstParagraph {
        @Override
        public Paragraph firstState() {
            return SecondParagraph;
        }

        @Override
        public Paragraph secondState() {
            return FirstParagraph;
        }

        @Override
        public String textOfParagraph() {
            return TextQuest.FIRST_PARAGRAPH;
        }
    },
    SecondParagraph {
        @Override
        public Paragraph firstState() {
            return ThirdParagraph;
        }

        @Override
        public Paragraph secondState() {
            return this;
        }

        @Override
        public String textOfParagraph() {
            return TextQuest.SECOND_PARAGRAPH;
        }
    },
    ThirdParagraph {
        @Override
        public Paragraph firstState() {
            return this;
        }

        @Override
        public Paragraph secondState() {
            return this;
        }

        @Override
        public String textOfParagraph() {
            return TextQuest.THIRD_PARAGRAPH;
        }
    },
    FinalParagraph {
        @Override
        public Paragraph firstState() {
            return this;
        }

        @Override
        public Paragraph secondState() {
            return this;
        }

        @Override
        public String textOfParagraph() {
            return TextQuest.FINAL_PARAGRAPH;
        }
    };
    public abstract Paragraph firstState();
    public abstract Paragraph secondState();
    public abstract String textOfParagraph();
}
