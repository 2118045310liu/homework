package com.itheima.homework;

import java.util.Scanner;

public class Haha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for(int i=0;i<str.length();i++){
            if(i != 0 && Character.isDigit(str.charAt(i-1)) && Character.isUpperCase(str.charAt(i))){

            }
        }
        qian(str);
    }

    //将r12c15这种形式转化成AB13这种形式
    public static void qian(String str){

    }
}
