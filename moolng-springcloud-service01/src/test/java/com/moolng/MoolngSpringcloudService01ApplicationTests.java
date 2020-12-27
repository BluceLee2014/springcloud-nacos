package com.moolng;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

//@SpringBootTest
class MoolngSpringcloudService01ApplicationTests {

    @Test
    void contextLoads() {
        System.out.println(Integer.toBinaryString(0x07));
        System.out.println(Integer.toBinaryString(11));

        System.out.println(Integer.valueOf("1100",2));
        System.out.println(Integer.valueOf("0111",2));

        System.out.println(11 & 0x07);
        System.out.println(Integer.valueOf("0011",2));

//        System.out.println(Integer.toBinaryString(2));
//        System.out.println(Integer.toBinaryString(4));
//        System.out.println(1 >> 3);
//        System.out.println(8 >> 3);
//
//        int a =1;
//        a |= 4;
//        System.out.println(a);
//
//        System.out.println(0x07);
    }

}
