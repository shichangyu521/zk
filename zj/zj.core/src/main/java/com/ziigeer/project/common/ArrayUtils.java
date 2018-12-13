package com.ziigeer.project.common;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayUtils {


    public static <T> List<T> asList(T... t) {
        List<T> list = new ArrayList<T>();
        Collections.addAll(list, t);
        return list;
    }

    public static void main(String[] args) {
        List<String> list = asList("123","234","345");
        list.add("456");
        System.out.println(list);
        List<String> list1 = asList();
        list1.add("123");
        System.out.println(list1);
    }
}


