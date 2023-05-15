package com.sparta.ap;
import java.time.LocalDate;
public class MethodExercise {
    public static void main(String[] args) {

        //Problem 1
        int result1 = doubleIt(6);
        System.out.println(result1);

        //Problem 2
        int result2 = calculate(4);
        System.out.println(result2);

        //Problem 3
        boolean result3 = isHigher(10, 5);
        System.out.println(result3);

        //Problem 4
        int n = 5;
        sequence(n);

        //Problem 5
        LocalDate date = LocalDate.of(2023,11,12);
        int noOfDays = daysBetweenTwoDates(date);
        System.out.println(noOfDays);
    }

    public static int doubleIt(int num) {
        return num * 2;
    }

   public static int calculate(int x) {
        return (x * 7) + 2;
    }

   public static boolean isHigher(int x, int y) {
        if (x > y) {
            return true;
        } else {
            return false;
        }
    }

    public static void sequence(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }
    public static int daysBetweenTwoDates(LocalDate date){
        LocalDate currentDate = LocalDate.now();
        return date.getDayOfYear()- currentDate.getDayOfYear();
    }
}

