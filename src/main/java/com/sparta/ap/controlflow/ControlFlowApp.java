package com.sparta.ap.controlflow;

public class ControlFlowApp {
    public static void main(String[] args) {
        int mark = 32;
        var result = "If else result: " + getGradeIfElse(mark);
        System.out.println(result);
        var result2 = "Ternary operator result: " + getGrade(mark);
        System.out.println(result2);

        var level = 0;
        var result3 = "Priority level: " + priority(level);
        System.out.println(result3);
    }


    public static  String priority(int level){
        String priority = "Code";
        switch (level){
            case 3:
                priority = priority + "Red";
                break;
            case 2:
            case 1:
                priority = priority + "Amber";
                break;
            case 0:
                priority = "Green";
                break;
            default:
                priority = "Error";
                break;
        }
        return priority;
    }
    public static String getGrade(int mark) {
        return mark >= 65 ? (mark >= 85 ? "Distinction" : "Pass") : "Fail";
    }

    public static String getGradeIfElse(int mark) {
        if (mark >= 85) {
            return "Distinction";
        } else if (mark >= 65) {
            return "Pass";
        } else {
            return "Fail";
        }
    }
}

