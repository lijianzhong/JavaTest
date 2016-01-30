package com.lijz.lang;

/**
 * Created by jianzhongli on 16/1/28.
 */
public class VersionCompare {

    public static  void main(String[] args){

        VersionCompare versionCompare = new VersionCompare();
        System.out.println(versionCompare.compareVersion("0.1", "1.1"));
    }


    public int compareVersion(String version1, String version2){

        String[] array1 = version1.split("\\.");

        String[] array2 = version2.split("\\.");

        int i=0;
        while(i<array1.length || i<array2.length){
            if(i<array1.length && i<array2.length){
                if(Integer.parseInt(array1[i]) < Integer.parseInt(array2[i])){
                    return -1;
                }else if(Integer.parseInt(array1[i]) > Integer.parseInt(array2[i])){
                    return 1;
                }
            }else if(i<array1.length){
                if(Integer.parseInt(array1[i]) != 0){
                    return 1;
                }
            }else if(i<array2.length){
                if(Integer.parseInt(array2[i]) != 0){
                    return -1;
                }
            }

            i++;
        }

        return 0;
    }
}
