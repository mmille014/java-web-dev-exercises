package org.launchcode.java.studios.inheritance;

public class Questions {
    private String MultipleChoiceQuestions;
    private String CheckboxQuestions;
    private String True_FalseQuestions;
    private int OverallScore;

    public Questions(String MultipleChoiceQuestions, String CheckboxQuestions, String True_FalseQuestions, Integer OverallScore) {
        this.MultipleChoiceQuestions = MultipleChoiceQuestions;
        this.CheckboxQuestions = CheckboxQuestions;
        this.True_FalseQuestions = True_FalseQuestions;

    }
}


//Public class Computer {
//    private String name;
//    private Stringspeed;
//    private Integer age;
//
//    public  Computer(String name, String speed, Integer age) {
//        this.name = name;
//        this.speed = speed;
//        this.age = age;
//    }
//    public static void startUpTime() {
//        System.out.println("The computer's startup time is 10 seconds.");
//    }
//    public static void seating() {
//        System.out.println("A leather office chair is utilized for the computer.");
//    }
//}