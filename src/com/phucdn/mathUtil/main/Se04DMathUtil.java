/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.phucdn.mathutil.main;

import com.phucdn.mathUtil.MathUtility;

/**
 *
 * @author phucd
 */
public class Se04DMathUtil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        System.out.println("Hello git hub!");
//        System.out.println("This is 11st upload form local to remote GitHub");
        int n = 5;
        long expected = 120;
        long actual = MathUtility.getFactorial(n);
        //minh so sanh de biet dung saiz
        System.out.println("5! exepected: " + expected + "; actual: " + actual);

        //tui test 0! co dung la 1 hem
        n = 0;
        expected = 1;
        actual = MathUtility.getFactorial(n);
        //minh so sanh de biet dung saiz
        System.out.println("5! exepected: " + expected + "; actual: " + actual);
    }

    //viet code thi phai test - nguyen tac phai theo
    //test ngay ting ham , ting class truoc kh rap chung voi cac class khac
    //test ngay khi xong ham, xong class
    //duoc goi la test muc do 1, muc Unit Test(test muc don vi code)
    //lam sao de test, co nhieu cach
    //1. Cach 1: sout(goi ham()) de in ra ket qua xu li cua ham
    //2. Cach 2:JOptionPane de popup le ket qua xu li cua ham (J Desktop)
    //3. Cach 3: Ghi ra LOG file, ra 1 trang WEB(jw)
    //4. Cach 4: May oi so sanh gium tao lun, vi ma co the so sanh dc
    //co cac phep toan de so sanh
    //con nguoi ko can luan ket qua dung sai
    //may se lo cho
    //Neu tat ca tinh huong chay dung ham deu dung mau xanh
    //hau het tinh huong deu chay dung, co 1 cai sai -> ham sai _> mau do
    //muon lam dc dieu nay phai co thu vien phu tro
    //c#, PHP, JS, RUBY,...
    //JAVA: JUnit, TestNG
    //PHP: PHPUnit
    //.....
    //dung: tuc la ham chay ra 1 gia tri - ACTUAL VALUE va ta thay ACTUAL VALUE khop , bang voi cai gia
    //tri ma ta mong doi , Ta tinh truoc = tay, goi la EXPECTED VALUE
    //Vd: 5!, ta hy vong expected ham tra ve dung 120- ham tra ve dung 120 - actual=120
}
