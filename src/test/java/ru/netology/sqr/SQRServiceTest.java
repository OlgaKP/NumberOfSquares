package ru.netology.sqr;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SQRServiceTest {

    @Test
    void shouldEnumeration() {
        SQRService squares = new SQRService();

        int minNumber = 200;
        int maxNumber = 300;
        int expected = 3;

        int actual = squares.enumeration(minNumber, maxNumber);

        assertEquals(expected, actual);
    }
}