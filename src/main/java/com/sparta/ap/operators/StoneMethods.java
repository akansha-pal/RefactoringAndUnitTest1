package com.sparta.ap.operators;

public class StoneMethods {
    public static void main(String[] args) {
        int input = 156;
        int stone = getStones(input);
        int pound = getPounds(input);
        System.out.println(stone);
        System.out.println(pound);
    }

    public static int getStones(int totalPounds){
        int noOfStones = totalPounds / 14;
        return noOfStones;
    }

    public static int getPounds(int totalPounds){
        int pounds = totalPounds % 14;
        return pounds;
    }
}
