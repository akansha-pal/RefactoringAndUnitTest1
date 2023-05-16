package com.sparta.test;

import com.sparta.ap.controlflow.ControlFlowApp;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ContolFlowTest {
    // getGradeIfElse Tests
    @ParameterizedTest
    @ValueSource(ints = {0, 40, 64})
    @DisplayName("Given a mark less than 65, getGradeIfElse returns Fail")
    public void givenAMarkLessThan65_getGradeIfElse_ReturnsFail(int mark) {
        var result = ControlFlowApp.getGradeIfElse(mark);
        Assertions.assertEquals("Fail", result);
    }

    @ParameterizedTest
    @ValueSource(ints = {65, 84})
    public void givenAMarkBetween65and84_getGradeIfElse_ReturnsPass(int mark) {
        Assertions.assertEquals("Pass", ControlFlowApp.getGradeIfElse(mark));
    }

    @ParameterizedTest
    @ValueSource(ints = {85, 100})
    public void givenAMarkBetween85and100_getGradeIfElse_ReturnsDistinction(int mark) {
        Assertions.assertEquals("Distinction", ControlFlowApp.getGradeIfElse(mark));
    }

    // getGrade Tests
    @ParameterizedTest
    @ValueSource(ints = {0, 40, 64})
    public void givenAMarkLessThan65_getGrade_ReturnsFail(int mark) {
        Assertions.assertEquals("Fail", ControlFlowApp.getGrade(mark));
    }

    @ParameterizedTest
    @ValueSource(ints = {65, 84})
    public void givenAMarkBetween65and84_getGrade_ReturnsPass(int mark) {
        Assertions.assertEquals("Pass", ControlFlowApp.getGrade(mark));
    }

    @ParameterizedTest
    @ValueSource(ints = {85, 100})
    public void givenAMarkBetween85and100_getGrade_ReturnsDistinction(int mark) {
        Assertions.assertEquals("Distinction", ControlFlowApp.getGrade(mark));
    }
}


