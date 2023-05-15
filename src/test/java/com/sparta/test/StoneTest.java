package com.sparta.test;

import com.sparta.ap.MovieClassifications;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StoneTest {
    @Test
    @DisplayName("Given an weight is 156, film category should be No film is available")
    public void filmCategory_NoFilmIsAvailable(){
        //Arrange
        var age = 2;
        var expectedClassification = "No film is available.";
        //Act
        var result = MovieClassifications.availableClassifications(age);
        //Assert
        Assertions.assertEquals(expectedClassification, result);
    }
}
