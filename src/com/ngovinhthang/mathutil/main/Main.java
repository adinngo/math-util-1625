/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ngovinhthang.mathutil.main;

import com.ngovinhthang.mathutil.core.MathUtility;

/**
 *
 * @author gnaht
 */
public class Main {
    public static void main(String[] args) {
        //thử tính giai thừa coi thử chạy đúng không
        //ta phải giả sử các tình huống sửa dụng hàm trong thực tính
        //đưa vào -5; 0; 20; 21
        //là một tình huống, hàm, app, màn hình, tính năng đc đưa vào sử dụng
        //giả lập hành vi xài của ai đó
        
        //TEST CASE: LÀ 1 TÌNH HUỐNG SỬ DỤNG, XÀI APP HAY XÀI HÀM MÀ NÓ BAO GỒM:
        //INPUT: DATA ĐẦU VÀO CỤ THỂ NÀO ĐÓ
        //OUTPUT: ĐẦU RA ỨNG VỚI XỬ LÍ CỦA HÀM/CHỨC NĂNG CỦA APP DĨ NHIÊN DÙNG ĐẦU VÀO ĐỂ XỬ LÍ
        //SO SÁNH ĐỂ XEM KẾT QUẢ CÓ NHƯ KÌ VỌNG
        
        long expected = 120; // kì vọng 5! = 120 
        int n = 5; //input
        long actual = MathUtility.getFractorial(n);
        System.out.println("5! = " + expected + " expected");
        System.out.println("5! = " + actual + " actual");
        
    }
}
