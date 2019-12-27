package com.chargebee.framework.pages;

import org.testng.Assert;
import org.testng.annotations.Test;

public class StringReversal {


    @Test
    public void numToSingleDigit() {

        int num = 22041993;
        int count = 0 ;

        for(;num>=10;) {
            for (; num != 0; num = num / 10) {
                count = count + num % 10;
            }
            num=count;
            count = 0;

        }
        System.out.println(num);
    }

    @Test
    public void numDigitAdd() {

        int num = 22041993;
        int count = 0 ;

        for (; num != 0; num = num / 10) {
            count = count + num % 10;
        }
        System.out.println(count);
    }

    @Test
    public void stringReversal() {
        String name = "BHARANI";
        String reverseName = "";

        int lengthOfName = name.length();

        for(int i=lengthOfName-1; i>=0; i--) {
            reverseName = reverseName + name.charAt(i);
        }

        System.out.println(reverseName);

    }


    @Test
    public void numReversal() {
        int num = 1234;
        String reverseNum = "";


        for (; num != 0; num = num / 10) {
            reverseNum = reverseNum + num % 10;
        }

        System.out.println(reverseNum);

    }

}
