/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ngovinhthang.mathutil.core;

/**
 *
 * @author gnaht
 */
public class MathUtility {
    //trong cái này cung cấp cho ai đó nhiều hàm xử lí toán học
    //clone class Math của JDK
    //chọn thiết kế là hàm static vì hàm tiện ích nền k cần lưu lại

    //hàm tính giai thừa!!!
    //k có giai thừa âm
    //0! = 1! = 1 quy ước
    //giai thừa hàm đồ thị dốc đứng, tăng nhanh về giá trị
    //20 giai thừa 18 con số 0, vừa đủ kiểu long trong java
    //21 giai thừa tràn
    //quy ước chỉ 20!
//    public static long getFractorial(int n) {
//        if (n < 0 || n > 20) 
//            throw new IllegalArgumentException("Invalid agrument. n must be 0...20");
//
//        if(n == 0 || n ==1) 
//            return 1;
//        
//        long product = 1;
//        for(int i = 2; i <= n; i++)
//            product *= i;
//        
//        return product;
//    }
    public static long getFractorial(int n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid agrument. n must be 0...20");
        }

        if (n == 0 || n == 1) {
            return 1;
        }

        return n * getFractorial(n - 1);
    }
}
