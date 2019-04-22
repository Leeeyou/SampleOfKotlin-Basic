package com.leeeyou.sampleofkotlin.basic.generic;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class TestJavaGeneric {
    public static void main(String[] args) {
        read();
    }

    static void writeTo(List<? super Number> list) {
        list.add(new AtomicInteger(1));
        list.add(10.1f);
//        list.add(new String(""));  // 编译错误
    }

    static void read() {
        //        List<Number> numbers = new ArrayList<Integer>();

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        List<? extends Number> subNum = numbers;
//        subNum.add(3);

        List<Number> totalList = new ArrayList<>();
        totalList.addAll(subNum);
        System.out.println(String.valueOf(totalList.size()));

//        Juicer.Companion.makeBananaJuice();
//        Juicer.makeBananaJuice();
    }
}
