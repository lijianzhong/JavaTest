package com.lijz.lang;

/**
 * Created by jianzhongli on 16/1/12.
 */
public class IntegerTest {

    public static void main(String[] args){

        System.out.println(Integer.MAX_VALUE);

        System.out.println(parseInt("+1234567891", 10));

    }

    public static int parseInt(String str, int radix) throws NumberFormatException{

        if(str == null){
            throw new NumberFormatException("str is null");
        }

        if(radix <2 || radix > 36){
            throw new NumberFormatException("radix is illegal");
        }

        int len = str.length();
        if(len == 0){
            throw new NumberFormatException("str is empty");
        }
        int result = 0;
        boolean negative = false;
        int i=0;
        int limit = -Integer.MAX_VALUE;
        int digit;
        char first = str.charAt(i);
        if(first < '0') { //-或者+
            if (first == '-') {
                negative = true;
                limit = Integer.MIN_VALUE;
            } else if (first != '+') {
                throw new NumberFormatException("first char is illegal");
            }
            if(len == 1){
                throw new NumberFormatException("str is illegal");
            }
            i++;
        }

        while(i < len){
            char c = str.charAt(i++);
            digit = Character.digit(c, radix);
            if(digit < 0){
                throw new NumberFormatException("char is illegal, char = " + c);
            }
            if(result<limit/radix){
                throw new NumberFormatException("str has exceed Integer value");
            }
            result = result * radix;
            if(result < limit + digit){
                throw new NumberFormatException("str has exceed Integer value");
            }
            result = result - digit;
        }

        return negative ? result : -result;

    }
}
