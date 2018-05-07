package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner  sc=new Scanner(System.in);
        int[] a=new int[6];
        for (int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }

for (int i=0;i<a.length-1;i++) {
    for (int j = i+1; j < a.length; j++) {

        if (a[i] > a[j ]) {
            a[i] = a[i] ^ a[j ];
            a[j ] = a[i] ^ a[j ];
            a[i] = a[i] ^ a[j ];

        }
    }
}

        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }

    }
}
