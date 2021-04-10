package com.example.demo;

import java.util.ArrayList;

public class ShinyNumber {
    public static void main(String[] arg) {
        int count = 0;
        boolean shinyFlag;
        ArrayList list = new ArrayList();
        String name="guna";
        for(int i=0;i<name.length();i++){
            char current=name.charAt(i);
            if(current=='a'){
                System.out.println(" has vowel="+current);
            }
        }
/*        for (int i = 1; 100 > count; i++) {

            shinyFlag = isShineNumber(i);
            if (shinyFlag) {
                list.add(i);
                count++;
            }

        }*/
        System.out.println(" list" + list);
    }

    public static boolean isShineNumber(int number) {
        // number=345566;
        boolean flag = true;
        boolean isShine = true;
        int pre = 0;
        String numberStr = String.valueOf(number);
        for (int i = 0; i < numberStr.length(); i++) {
            int current = Character.digit(numberStr.charAt(i), 10);

            if (i != 0) {
                if (current < pre) {
                    flag = false;
                    break;
                } else {
                    pre = current;
                }
            } else {
                pre = current;
            }
        }
        isShine = flag;
        return isShine;
    }
}
