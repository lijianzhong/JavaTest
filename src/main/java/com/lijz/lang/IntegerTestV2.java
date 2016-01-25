package com.lijz.lang;

/**
 * Created by jianzhongli on 16/1/25.
 */
public class IntegerTestV2 {

    public static void main(String[] args) throws Exception {

        IntegerTestV2 test = new IntegerTestV2();
        //System.out.println(test.parserInt("+2147483648"));
        //System.out.println(test.parserInt("-"));
        //System.out.println(test.parserInt("       "));
        //System.out.println(test.parserInt("+2147483647"));
        //System.out.println(test.parserInt("+adjflasjdfj"));
        //System.out.println(test.parserInt("-2147483648"));
        //System.out.println(test.parserInt("-2147483649"));
        System.out.println(test.parserInt("+"));
        //System.out.println(Integer.MAX_VALUE);
    }

    public int parserInt(String str) throws Exception{

        if(str == null || str.length() ==0){
            throw new NumberFormatException();
        }

        str = str.trim();
        if(str.length() == 0){
            throw new NumberFormatException("str is empty");
        }

        boolean negative = false;

        //以负数为最大限制
        int limit = -Integer.MAX_VALUE;

        char digit = str.charAt(0);

        int i = 0;

        if(digit == '-' || digit == '+'){
           if(digit == '-'){
               negative = true;
               limit = Integer.MIN_VALUE;
           }

           if(str.length() == 1){
               throw new NumberFormatException("str is illegal, str="+str);
           }

            i++;

        }

        int result = 0;
        while(i < str.length()){
            char c = str.charAt(i);
            if(c < '0' || c> '9'){
                throw new NumberFormatException("str is illegal, str="+str);
            }
            if((limit + c-'0')/10 > result){
                throw new NumberFormatException("number is overflow");
            }
            result = result * 10 - (c-'0');
            i++;
        }

        return negative ? result : -result;

    }
}
