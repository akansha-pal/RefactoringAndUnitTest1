package com.sparta.test;

import com.sparta.ap.Program;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ProgramTest {
   @Test
   @DisplayName("My first test")
   public void firstTest(){
      Assertions.assertTrue(5==5);
   }
   @Test
   @DisplayName("Given a time of 21 greeting returns Good evening")
   public void givenATimeOf21_Greeting_ReturnsGoodEvening(){
       //Arrange
       var time = 21;
       var expectedGreeting = "Good evening!";
       //Act
       var result = Program.greeting(time);
       //Assert
       Assertions.assertEquals(expectedGreeting, result);
   }
    @Test
    @DisplayName("Given a time of 10 greeting returns Good morning")
    public void givenATimeOf10_Greeting_ReturnsGoodMorning(){
        //Arrange
        var time = 10;
        var expectedGreeting = "Good morning!";
        //Act
        var result = Program.greeting(time);
        //Assert
        Assertions.assertEquals(expectedGreeting, result);
    }
    @Test
    @DisplayName("Given a time of 15 greeting returns Good afternoon")
    public void givenATimeOf15_Greeting_ReturnsGoodAfternoon(){
        Assertions.assertEquals(Program.greeting(15), "Good afternoon");
    }
}
