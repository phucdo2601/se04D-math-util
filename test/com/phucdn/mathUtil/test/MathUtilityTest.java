/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.phucdn.mathUtil.test;

import static com.phucdn.mathUtil.MathUtility.*;//muon cac ham, bien
//trong class go truc tiep luon go truc tiep luon 
//go truc tiep ko can dan ten class
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author phucd
 */
public class MathUtilityTest {
    @Test
    public void testFactorialGivenRightArgumentGoodResult() {
        int n = 5; // tui mun test 5! co dung la
        long expected = 120; //120 hay ko

        long actual = getFactorial(n);
        assertEquals(expected, actual);
        //minh test tiep cac truong hop khac dung dau vao, dung dau ra
        //khoi can bien trung gian, choi luon trong lenh
        assertEquals(720, getFactorial(6));
        assertEquals(24, getFactorial(4));
        assertEquals(6, getFactorial(3));
        assertEquals(1, getFactorial(1));
        assertEquals(1, getFactorial(0));
    }
    
    //fieu gi xay ra khi ta dua tham so bat hop ly,am, hoac >20
    //theo thiet ke cua ham, dua vao ca chon se nem ra ngoai le 
    //ta can test xem, ngoai le dc nem ra ko neu ca chon
    // tuc la duy thay xuat hien ngoai le neu co ca chon dua vao -> ham đúng
    // thấy ngoại lệ khi có cà chớn mình lại mừng vì hàm đã chạy đunga
    @Test(expected = IllegalArgumentException.class)
//    co dung la ham nay khi chay thi nem raa ngoai le cung ten hay ko 
    //neu dung thi nem ra ngoai le cung ten, code dung r xanh thoi
    public void testFactorialWrongArgumentThrowException() {
        // mnih test tinh huong ham phai nem ra ngoai le neu tham so ca chon
        // ngoai le la ko phai la value de so sanh, ko dung assertEquald()
        //ta phai dung chieu khac. JUnit 4 khac JUnit 5 o cho bat ngoai le
        //ky 5 di du thinh mon SWT301 cua tui: DT, Lamda Exception lien quan
        //JUnit 5       Dependency Injection/ SOLID
        getFactorial(-5);
        getFactorial(21);
        getFactorial(40);
    }

}
