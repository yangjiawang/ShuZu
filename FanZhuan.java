package com.company;

import java.util.Scanner;

/**
 * Created by YANGJIAWANG on 2018/5/7.
 */
public class FanZhuan {
    public static void main(String[] atgs) {
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        StringBuffer str=new StringBuffer(a);
      System.out.println(str.reverse());
    }
}
