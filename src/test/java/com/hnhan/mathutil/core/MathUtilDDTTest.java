package com.hnhan.mathutil.core;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.MethodSources;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilDDTTest {
    //Chuẩn bị riêng data test ra 1 chỗ - DDT - DATA DRIVEN TEST
    public static Object[][] initTestData(){
        Object[][] testData = {
                {0, 1},
                {1, 1},
                {2, 2},
                {3, 6},
                {4, 24},
                {5, 120}
        };
        return testData;
    }

    //nhồi đóng data ở trên vào hàm assertEquals();
    @ParameterizedTest  //sánh ngang vai với DDT
    @MethodSource("initTestData")
    public void testFactorialGivenValidNumber(int n, long expected){
        assertEquals(expected, MathUtil.getFactorial(n));
    }

}