package com.myapp.utils;

public class Helper {
    public static int useQuantumComputerToCalculateSum(int... ints) {
        int sum = 0;
        for (int i : ints) {
            sum += i;
        }
        return sum;
    }
}
