package com.codecool.sum_of_odd_numbers;

import java.util.List;

public class OddNumbers {

    public static Integer sum(List<Integer> numbers) {

        Integer oddNumbersSum = 0;

        for(int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 == 1 || numbers.get(i) % 2 == -1) {
                oddNumbersSum += numbers.get(i);
            }
        }
            return oddNumbersSum;
    }
}