/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.ngovinhthang.mathutil.test.core;

import com.ngovinhthang.mathutil.core.MathUtility;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author gnaht
 */
//CÂU LỆNH NÀY CỦA JUNIT BÁO HIỆU RẰNG SẼ CẦN LOOP QUA TẬP DATA ĐỂ 
//LẤY CẶP DATA INPUT/EXPECTED NHỒI VÀO HÀM TEST
@RunWith(value = Parameterized.class)
public class MathUtilityDDTTest {

    //HÀM NÀY TA SẼ TRẢ VỀ MẢNG 2 CHIỀU GỒM NHIỀU CẶP Expected|Input
    @Parameterized.Parameters //JUnit sẽ ngầm chạy loop qua từng dòng
                                //của mảng để lấy ra đc cặp data input/expected
                                //tên hàm ko quan trọng, quan trọng là @
    public static Object[][] initData() {
        return new Integer[][]{
            {0, 1},
            {1, 1},
            {2, 2},
            {3, 6},
            {4, 24},
            {5, 120},
            {6, 720}
        };
    }
    //giả sử loop qua từng dòng của mảng, ta vẫn cần gán từng value của cột
    //gán vào biến tương ứng input, expected để lát hồi feed cho hàm

    @Parameterized.Parameter(value = 0)
    public int n; //biến map với value của cột 0 của mảng

    @Parameterized.Parameter(value = 1)
    public long expected;

    @Test
    public void testGetFractorialGivenRightAgrumentReturnsWell() {
        Assert.assertEquals(expected, MathUtility.getFractorial(n));
    }
}
