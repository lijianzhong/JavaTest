package com.lijz.lang.classinfo;

/**
 * Created by jianzhongli on 16/2/14.
 */
public class ToyTest {

    public static void printInfo(Class cs){

        System.out.println("class name =" + cs.getName() + "is interface ? " + cs.isInterface());

        System.out.println("simple name ="+ cs.getSimpleName());

        System.out.println("canonicalName = " +cs.getCanonicalName());
    }

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {

        Class cs = Class.forName("com.lijz.lang.classinfo.FancyToy");

        printInfo(cs);

        for(Class inter : cs.getInterfaces()){
            printInfo(inter);
        }

        Class superClass = cs.getSuperclass();

        Object obj = superClass.newInstance();

        printInfo(obj.getClass());


    }
}
