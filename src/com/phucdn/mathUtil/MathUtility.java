/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.phucdn.mathUtil;

/**
 *
 * @author phucd
 */
public class MathUtility {
    //class nay chua mot nhom ham toan hoc, fake tu class chua
    // java.uti.Math cua jdk
    // vi la do sai chung 
    
    public static final double PI=3.1415;
    //am giai thua ko tinh dc
    //ham chi chap nhan tu 0..20!
    //0!=1!=1
    public static long getFactorial(int n){
        if(n<0 || n>20){
            throw new IllegalArgumentException("Invalid argrument. n must be between 0..20 ");
        }
        if(n==0 || n==1)
            return 1;
        long result=1;
        for (int i = 2; i <= n; i++) {
            result*=i;
        }
        return result;
    }
    
   
}
