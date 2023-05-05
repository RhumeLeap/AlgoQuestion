package io.turntabl.day2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Question1Test {

    private Question1 question1;

    @BeforeEach
    void setUp() {
        question1 = new Question1();
    }

    @Test
    void testIfReturnsNullPointerException() {
        List<String> numbers = null;
        assertThrows(NullPointerException.class, () -> question1.getHighestNumber(numbers));
    }

    @Test
    void testMethodForEmptyList() {
        List<String> numbers = new ArrayList<>();
        assertThrows(NullPointerException.class, () -> question1.getHighestNumber(numbers));
    }

    @Test
    void testIfReturnsCorrectPointerException() {
        List<String> numbers = List.of("1", "2", "", "40", "2", "", "2");
        assertEquals(42, question1.getHighestNumber(numbers));
    }

    @Test
    void getHighestNumber2() {
    }
}