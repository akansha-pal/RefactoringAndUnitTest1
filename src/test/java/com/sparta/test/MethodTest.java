package com.sparta.test;

import com.sparta.ap.MethodExercise;
import com.sparta.ap.operators.StoneMethods;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.time.LocalDate;

import static java.lang.Integer.parseInt;

public class MethodTest {
    @ParameterizedTest
    @ValueSource(ints ={6} )
    @DisplayName("Given the integer parameter 6 and 2, result should be their product")
    public void doubleIt_returnsProduct(int num){
        //Arrange
        var expectedResult = 12;
        //Act
        var result = MethodExercise.doubleIt(num);
        //Assert
        Assertions.assertEquals(expectedResult, result);
    }
    @ParameterizedTest
    @ValueSource(ints ={4} )
    @DisplayName("Given the value 4, 7 and 2, result should be addition of 2 to the product of 4 and 7")
    public void calculate_returnsProduct(int x){
        //Arrange
        var expectedResult = 30;
        //Act
        var result = MethodExercise.calculate(x);
        //Assert
        Assertions.assertEquals(expectedResult, result);
    }
    @ParameterizedTest
    @CsvSource({"5,2", "6,1", "90,40"})
    @DisplayName("Given the value 10 and 5, result should be TRUE")
    public void isHigher_returnsTrue(int x,int y){
        //Arrange
        var expectedResult = true;
        //Act
        var result = MethodExercise.isHigher(x,y);
        //Assert
        Assertions.assertEquals(expectedResult, result);
    }
    @ParameterizedTest
    @ValueSource(strings={"2023-05-23"})
    @DisplayName("Given a localdate parameter, result should display the no. of days between local date and current date")
    public void range_returnsNoOfDays(String date){
        //Arrange
        var expectedResult = 8;
        //Act
        var newDate = LocalDate.of(parseInt(date.substring(0,4)), parseInt(date.substring(5,7)), parseInt(date.substring(8,10)));
        var result = MethodExercise.daysBetweenTwoDates(newDate);
        //Assert
        Assertions.assertEquals(expectedResult, result);
    }
}
