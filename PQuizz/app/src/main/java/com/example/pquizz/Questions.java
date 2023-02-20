package com.example.pquizz;

public class Questions {
    public String mQuestions[]={
            "which is the first planet in the solar system?",
            "which is the second planet in the solar system?",
            "which is the third planet in the solar system?",
            "which is the fourth planet in the solar system?",
            "which is the fifth planet in the solar system?",
            "which is the sixth planet in the solar system?",
            "which is the seventh planet in the solar system?",
            "which is the eight planet in the solar system?",
            "which is the nine planet in the solar system?",
    };

    private String mChoices[][]={
            {"Mercury","Venus","Mars","Saturn"},
            {"Jupiter","Venus","Earth","Neptune"},
            {"Earth","Jupiter","pluto","Venus"},
            {"Jupiter","Saturn","Mars","Earth"},
            {"Jupiter","pluto","Mercury","Earth"},
            {"Uranus","Venus","Mars","Saturn"},
            {"Saturn","Uranus","Mars","Earth"},
            {"Venus","Neptune","Pluto","Mars"},
            {"Mercury","Venus","Mars","Pluto"}
    };

    private String mCorrectAnswer[]={"Mercury","Venus","Earth","Mars","Jupiter","Saturn","Uranus","Neptune","Pluto"};

    public String getQuestion(int a){
        String question=mQuestions[a];
        return question;
    }

    public String getChoice1(int a){
        String choice =mChoices[a][0];
        return choice;
    }

    public String getChoice2(int a){
        String choice =mChoices[a][1];
        return choice;
    }
    public String getChoice3(int a){
        String choice =mChoices[a][2];
        return choice;
    }

    public String getChoice4(int a){
        String choice =mChoices[a][3];
        return choice;
    }

    public String getCorrectAnswer(int a){
        String answer =mCorrectAnswer[a];
        return answer;
    }



}
