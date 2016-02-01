package com.lijz.lang;

/**
 * Created by jianzhongli on 16/2/1.
 */
public class StringTest {

    public static void main(String[] args){

        String a = "abc";

        String b= "abc";

        System.out.println(a==b);

        String c = new String("abc");

        String d = new String("abc");

        System.out.println(c==d);

        String str1 = " abc" ;
        String str2 = " abc" ;
        str1 = " bcd" ;
        System.out.println(str1 + " ," + str2); //bcd, abc
        System.out.println(str1==str2); //false
    }
}
