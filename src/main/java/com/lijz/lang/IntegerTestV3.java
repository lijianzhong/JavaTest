package com.lijz.lang;

import java.util.*;

/**
 * Created by jianzhongli on 16/2/16.
 */
public class IntegerTestV3 {

    public static void main(String[] args){

        Integer a = new Integer(5);
        Integer b = new Integer(5);
        Integer c = 5;
        System.out.println(a==b);
        System.out.println(a==c);

        List<Integer> list = Arrays.asList(3,4,5,6,7);
        System.out.println(list);
        System.out.println(list.indexOf(new Integer(5)));
        for (Iterator<Integer> iterator = list.iterator(); iterator.hasNext();) {
            int num = iterator.next();
            System.out.println(num);
        }

        ListIterator<Integer> listIterator = list.listIterator();
        while(listIterator.hasNext()){
            int num = listIterator.next();
            System.out.println(num);
        }

        while(listIterator.hasPrevious()){
            int num = listIterator.previous();
            System.out.println(num);
        }


//        List<Integer> numbers = new ArrayList<Integer>();
//        numbers.add(1);
//        numbers.add(2);
//        numbers.add(3);
//
//        System.out.println("ArrayList contains : " + numbers);
//
//        // Calling remove(index)
//        numbers.remove(1); //removing object at index 1 i.e. 2nd Object, which is 2
//        //Calling remove(object)
//        numbers.remove(new Integer(3));
//
//        System.out.println("ArrayList after remove contains : " + numbers);


        List<Integer> numbers = new ArrayList<Integer>();
        numbers.add(101);
        numbers.add(200);
        numbers.add(301);
        numbers.add(400);

        System.out.println("ArrayList Before : " + numbers);

        Iterator<Integer> itr = numbers.iterator();

        // remove all even numbers
        while (itr.hasNext()) {
            Integer number = itr.next();

            if (number % 2 == 0) {
                itr.remove();
            }
        }

        System.out.println("ArrayList After : " + numbers);




    }
}
