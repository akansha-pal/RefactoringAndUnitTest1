package com.sparta.test;

import com.sparta.ap.MovieClassifications;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class Classification_Tests {
//    / @Test
//     @DisplayName("Given an age is 2, film category should be No film is available")
//     public void filmCategory_NoFilmIsAvailable(){
//         //Arrange
//         var age = 2;
//         var expectedClassification = "No film is available.";
//         //Act
//         var result = MovieClassifications.availableClassifications(age);
//         //Assert
//         Assertions.assertEquals(expectedClassification, result);
//     }
    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3})
    @DisplayName("Given an age greater than 1 and less than 4, film category should be No film is available.")
    public void filmCategory_NoFilmIsAvailable(int age) {
        //Arrange
        var expectedClassification = "No film is available.";
        //Act
        var result = MovieClassifications.availableClassifications(age);
        //Assert
        Assertions.assertEquals(expectedClassification, result);
    }

    //    @Test
//    @DisplayName("Given an age is 5, film category should be U films are available")
//    public void filmCategory_UFilmsAreAvailable(int age){
//        //Arrange
//
//        var expectedClassification = "U films are available.";
//        //Act
//        var result = MovieClassifications.availableClassifications(age);
//        //Assert
//        Assertions.assertEquals(expectedClassification, result);
//    }
    @ParameterizedTest
    @ValueSource(ints = {4, 5, 6, 7})
    @DisplayName("Given an age greater than 4 and less than 8, film category should be U films are available.")
    public void filmCategory_UFilmsAreAvailable(int age) {
        //Arrange
        var expectedClassification = "U films are available.";
        //Act
        var result = MovieClassifications.availableClassifications(age);
        //Assert
        Assertions.assertEquals(expectedClassification, result);
    }

    //    @Test
//    @DisplayName("Given an age is 10, film category should be U and PG films are available.")
//    public void filmCategory_UAndPGFilmsAreAvailable(){
//        //Arrange
//        var age = 10;
//        var expectedClassification = "U and PG films are available.";
//        //Act
//        var result = MovieClassifications.availableClassifications(age);
//        //Assert
//        Assertions.assertEquals(expectedClassification, result);
//    }
    @ParameterizedTest
    @ValueSource(ints = {8, 9, 10, 11})
    @DisplayName("Given an age greater than 8 and less than 12, film category should be U and PG films are available.")
    public void filmCategory_UAndPGFilmsAreAvailable(int age) {
        //Arrange
        var expectedClassification = "U and PG films are available.";
        //Act
        var result = MovieClassifications.availableClassifications(age);
        //Assert
        Assertions.assertEquals(expectedClassification, result);
    }

    //    @Test
//    @DisplayName("Given an age is 13, film category should be U, PG and 12 films are available.")
//    public void filmCategory_UPGAnd12FilmsAreAvailable(){
//        //Arrange
//        var age = 13;
//        var expectedClassification = "U, PG and 12 films are available.";
//        //Act
//        var result = MovieClassifications.availableClassifications(age);
//        //Assert
//        Assertions.assertEquals(expectedClassification, result);
//    }
    @ParameterizedTest
    @ValueSource(ints = {12, 13, 14})
    @DisplayName("Given an age greater than 12 and less than 15, film category should be U, PG and 12 films are available.")
    public void filmCategory_UPGAnd12FilmsAreAvailable(int age) {
        //Arrange
        var expectedClassification = "U, PG and 12 films are available.";
        //Act
        var result = MovieClassifications.availableClassifications(age);
        //Assert
        Assertions.assertEquals(expectedClassification, result);
    }

    //    @Test
//    @DisplayName("Given an age is 17, film category should be U, PG, 12 and 15 films are available.")
//    public void filmCategory_UPG12And15FilmsAreAvailable(){
//        //Arrange
//        var age = 17;
//        var expectedClassification = "U, PG, 12 and 15 films are available.";
//        //Act
//        var result = MovieClassifications.availableClassifications(age);
//        //Assert
//        Assertions.assertEquals(expectedClassification, result);
//    }
    @ParameterizedTest
    @ValueSource(ints = {15, 16, 17})
    @DisplayName("Given an age greater than 15 and less than 18, film category should be U, PG, 12 and 15 films are available.")
    public void filmCategory_UPG1215FilmsAreAvailable(int age) {
        //Arrange
        var expectedClassification = "U, PG, 12 and 15 films are available.";
        //Act
        var result = MovieClassifications.availableClassifications(age);
        //Assert
        Assertions.assertEquals(expectedClassification, result);
    }
}
//    @Test
//    @DisplayName("Given an age is 20, film category should be All films are available.")
//    public void filmCategory_AllFilmsAreAvailable(){
//        //Arrange
//        var age = 20;
//        var expectedClassification = "All films are available.";
//        //Act
//        var result = MovieClassifications.availableClassifications(age);
//        //Assert
//        Assertions.assertEquals(expectedClassification, result);
//    }
//
//
//    //Boundary value analysis
//    @Test
//    @DisplayName("Given an age is 12, film category should be U, PG and 12 films are available.")
//    public void filmCategory_UAndPGFilmAreAvailable(){
//        //Arrange
//        var age = 12;
//        var expectedClassification = "U, PG and 12 films are available.";
//        //Act
//        var result = MovieClassifications.availableClassifications(age);
//        //Assert
//        Assertions.assertEquals(expectedClassification, result);
//    }
//    @Test
//    @DisplayName("Given an age is 15, film category should be U, PG, 12 and 15 films are available.")
//    public void filmCategory_UPGAnd12FilmAreAvailable(){
//        //Arrange
//        var age = 15;
//        var expectedClassification = "U, PG, 12 and 15 films are available.";
//        //Act
//        var result = MovieClassifications.availableClassifications(age);
//        //Assert
//        Assertions.assertEquals(expectedClassification, result);
//    }
//    @Test
//    @DisplayName("Given an age is 18, film category should be U, PG, 12 and 15 films are available.")
//    public void filmCategory_UPG12And15FilmAreAvailable(){
//        //Arrange
//        var age = 18;
//        var expectedClassification = "All films are available.";
//        //Act
//        var result = MovieClassifications.availableClassifications(age);
//        //Assert
//        Assertions.assertEquals(expectedClassification, result);
//    }
//}


