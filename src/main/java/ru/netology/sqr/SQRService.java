package ru.netology.sqr;

public class SQRService {
    public int enumeration(int min, int max){
        int count = 0;

        for (int i = 10; i < 100; i++) {
            int square = i * i;
            if (square <= max && square >= min) {
                count ++;
            }
        }
        return count;
    }
}
