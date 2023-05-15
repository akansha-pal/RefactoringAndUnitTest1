package com.sparta.ap;

public class Program {
    public static void main(String[] args) {
        int timeOfDay = 21;

        greeting(timeOfDay);
    }

    public static String greeting(int timeOfDay) {
        String greetingMessage;
        if (timeOfDay >= 5 && timeOfDay <=12) {
            greetingMessage ="Good morning!";
        } else if (timeOfDay >= 12 && timeOfDay <= 18) {
            greetingMessage ="Good afternoon!";
        } else {
            greetingMessage="Good evening!";
        }
        return greetingMessage;
    }
}