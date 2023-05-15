package com.sparta.test;
import com.sparta.ap.operators.StoneMethods;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class StoneTest {
    @ParameterizedTest
    @ValueSource(ints =156 )
    @DisplayName("Given the weight is 156, no of stones should be 11")
    public void givenWeight_returns11(int weight){
        //Arrange
        var expectedResult = 11;
        //Act
        var result = StoneMethods.getStones(weight);
        //Assert
        Assertions.assertEquals(expectedResult, result);
    }
    @ParameterizedTest
    @ValueSource(ints =156 )
    @DisplayName("Given the weight is 156, no of pounds should be 2")
    public void givenWeight_returns2(int weight){
        //Arrange
        var expectedResult = 2;
        //Act
        var result = StoneMethods.getPounds(weight);
        //Assert
        Assertions.assertEquals(expectedResult, result);
    }
}
