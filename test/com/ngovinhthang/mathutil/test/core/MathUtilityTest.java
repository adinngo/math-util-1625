/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.ngovinhthang.mathutil.test.core;

import com.ngovinhthang.mathutil.core.MathUtility;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author gnaht
 */
public class MathUtilityTest {

    //ĐÂY LÀ CLASS SẼ SỬ DỤNG CÁC HÀM CỦA THƯ VIỆN/FRAMEWORK JUNIT
    //ĐỂ KIỂM THỬ/KIỂM TRA CODE CHÍNH - HÀM tinhGiaiThua() bên class MathUtil
    //có nhiều quy tắc đặt tên hàm kiểm thử
    //nhưng thường sẽ là nói lên mục đích của các case/tình huống kiểm thử
    //@Test //JUnit sẽ phối hợp với JVM để chạy hàm này
    //@Test phía hậu trường chính là public static void main()
    //Có nhiều @Test ứng với nhiều case khác nhau để kiểm thử hàm tính giai thừa
//    public void testGetFractorialGivenRightAgrumentReturnsWell() {
//        int n = 0; //test thử tình huống tử tế đầu vào, mày phải chạy đúng
//        long expected = 1;
//        //long actual = ;//gọi hàm cần test bên core/app chính/code chính
//        long actual = MathUtility.getFractorial(n);
//        //so sánh expected vs actual dùng xanh đỏ , framework
//        Assert.assertEquals(expected, actual);
//
//        //ta có thể gộp thêm vài case thành công/đưa đầu vào ngon!!! hàm phải tính ngon
//        Assert.assertEquals(1, MathUtility.getFractorial(1));
//        Assert.assertEquals(6, MathUtility.getFractorial(3));
//        Assert.assertEquals(24, MathUtility.getFractorial(4));
//        Assert.assertEquals(12, MathUtility.getFractorial(5));
//        Assert.assertEquals(720, MathUtility.getFractorial(6));
//
//    }
    //2.đưa data vào cà chớn, âm, > 20; THIẾT KẾ CỦA HÀM NÉM RA NGOẠI LỆ
    //TAO KÌ VỌNG NGOẠI LỆ XUẤT HIỆN KHI N < 0 || N > 20
    //rất mong ngoại lệ xuất hiện với n cà chớn này

    //nếu hàm nhận vào n < 0 or n > 20 và hàm ném ra ngoại lệ
    //HÀM CHẠY ĐÚNG NHƯ THIẾT KẾ -> XANH PHẢI XUẤT HIỆN
    //Test case: 
    //input: -5;
    //expected: IllegalArgumentException xuất hiện
    //tính huống bất thường xuât, ngoại lệ, ngoài dự tính, dự liệu
    //là những thứ k thể đo lường xo sánh theo kiểu value
    //mà chỉ có thể đo lường = cách chúng có xuất hiện hay không
    //assertEquals() k dùng để so sánh ngoại lệ
    //      Equals() chỉ dùng để so sánh value
//    @Test(expected = NumberFormatException.class)
//    public void testGetFractorialGivenWrongArgumentThrowsException() {
//        MathUtility.getFractorial(-5); // hàm @Test chạy, hay hàm getF() chạy
//    }
    //HÀM ĐÚNG LÀ NÓ CÓ NÉM RA NGOẠI LỆ THẬT SỰ
    //NHƯNG K PHẢI LÀ NGOẠI LỆ NHƯ KÌ VỌNG - THỰC SỰ KÌ VỌNG SAI
    //KHÔNG PHẢI HÀM NÉM SAI
    @Test(expected = IllegalArgumentException.class)
    public void testGetFractorialGivenWrongArgumentThrowsException() {
        MathUtility.getFractorial(-5); // hàm @Test chạy, hay hàm getF() chạy
    }

    //cách khác để bắt ngoại lệ xuất hiện
    //xài Lambda
    //Test case: hàm sẽ ném về ngoại lệ nếu nhận 21
    @Test
    public void testGetFractorialGivenWrongArgumentThrowsExceptionLambdaExpression() {
        //   Assert.assertThrows(THAM SỐ 1: LOẠI NGOẠI LỆ MUỐN BẮT,
        //                        THAM SỐ 2: ĐOẠN CODE VĂNG RA NGOẠI LỆ);
        Assert.assertThrows(IllegalArgumentException.class,
                () -> MathUtility.getFractorial(21)
        );
    }

    //Bắt ngoại lệ, xem hàm có ném về ngoại leeh hay không khi n cà chớn
    //
    @Test
    public void testGetFractorialGivenWrongArgumentThrowsException_TryCatch() {

        //chủ động kiểm soát ngoại lệ
        try {
            MathUtility.getFractorial(-5);
        } catch (Exception e) {
            //bắt try-catch là JUnit sẽ ra xanh do đã chủ động kiểm soát ngoại lệ
            //nhưng không chắc ngoại lệ mình cần có xuất hiện hay không???
            //có đoạn code kiểm soát đúng ngoại lệ IllegalArgumentException()
            Assert.assertEquals("Invalid agrument. n must be 0...20",
                    e.getMessage());
        }

    }

 
}
