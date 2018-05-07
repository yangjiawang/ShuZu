package com.company;

/**
 * Created by YANGJIAWANG on 2018/5/7.
 */
public class Jin {
    public static void main(String[] atgs) {
        int h=0;
        int t=1;
        while (true){
        h=h+3;
        if (h>=7){
            break;
        }
        h=h-2;
        t++;
    }
    System.out.println(t+"天");

    }
}
