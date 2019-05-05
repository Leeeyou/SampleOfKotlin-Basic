package com.leeeyou.sampleofkotlin.basic.generic;

import com.leeeyou.sampleofkotlin.basic.generic.bean.Apple;
import com.leeeyou.sampleofkotlin.basic.generic.bean.Fruit;
import com.leeeyou.sampleofkotlin.basic.generic.bean.GreenApple;
import com.leeeyou.sampleofkotlin.basic.generic.bean.RedApple;

import java.util.ArrayList;
import java.util.List;

public class TestJavaGeneric {
    public static void main(String[] args) {
        testUpperBoundsWildcards();
//        testLowerBoundsWildcards();
    }

    private static void testLowerBoundsWildcards() {
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple("苹果1"));
        apples.add(new Apple("苹果2"));
        apples.add(new Apple("苹果3"));

        List<? super Apple> appleList = apples;
        for (Object object : appleList) {
            System.out.println(((Apple) object).getName());
        }
        System.out.println();

        List<Fruit> fruits = new ArrayList<>();
        fruits.add(new Fruit("水果1"));
        fruits.add(new Fruit("水果2"));
        fruits.add(new Fruit("水果3"));
        appleList = fruits;
        for (Object object : appleList) {
            System.out.println(((Fruit) object).getName());
        }
        System.out.println();

        List<RedApple> redApples = new ArrayList<>();
        redApples.add(new RedApple("红苹果1"));
        redApples.add(new RedApple("红苹果2"));
        redApples.add(new RedApple("红苹果3"));
//        appleList = redApples;//error

        appleList.add(new RedApple("红苹果1"));
        appleList.add(new GreenApple("绿苹果1"));
        appleList.set(0, new Apple("苹果1"));
        System.out.println("苹果的总数：" + appleList.size());
        for (Object object : appleList) {
//            System.out.println(((Apple) object).getName());
            System.out.println("    " + ((Fruit) object).getName());
        }

    }

    private static void testUpperBoundsWildcards() {
        List<RedApple> redAppleList = new ArrayList<>();
        redAppleList.add(new RedApple("红苹果1"));
        redAppleList.add(new RedApple("红苹果2"));
        redAppleList.add(new RedApple("红苹果3"));

//        List<Apple> appleList = redAppleList; //error，这里明确规定要求是Apple类型，没有灵活性可言。？没有继承关系可言
        List<? extends Apple> appleList = redAppleList;//利用通配符的灵活性，可以成功将 红苹果列表 赋值给 苹果列表
        for (Fruit fruit : appleList) {
            System.out.println(fruit.getName());
        }
        System.out.println();

        List<GreenApple> greenApples = new ArrayList<>();
        greenApples.add(new GreenApple("绿苹果1"));
        greenApples.add(new GreenApple("绿苹果2"));
        greenApples.add(new GreenApple("绿苹果3"));
        greenApples.add(new GreenApple("绿苹果4"));
        appleList = greenApples;//利用通配符，appleList 灵活的接收了 红苹果列表 和 绿苹果列表
        for (Fruit fruit : appleList) {
            System.out.println(fruit.getName());
        }

//        appleList.add(new Apple("苹果1"));//error
//        appleList.set(5, new RedApple("红苹果4"));//error
//        appleList.add(new GreenApple("绿苹果5"));//error

        System.out.println();
    }

}
