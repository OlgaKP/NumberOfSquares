package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SQRServiceTest {

    @ParameterizedTest
    @CsvSource(value = {"200,300,3", "200,250,1"})
    void shouldEnumeration(int minNumber, int maxNumber, int expected) {
        SQRService squares = new SQRService();

        int actual = squares.enumeration(minNumber, maxNumber);

        assertEquals(expected, actual);
    }
}