package com.zz.select;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;

@SpringBootTest
public class lalalla {

    @Test
    public void test() {
        ArrayList<String> list = new ArrayList<>();
        list.add("csdn");
        list.add("微晶石");
        list.add("掘金");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            if (next.equals("csdn")) {
                iterator.remove();
            }
        }
        System.out.println(list);
    }

    @Test
    public void test1() throws ClassNotFoundException {
        Class<?> name = Class.forName("com.zz.vo.Menus");
        Field[] fields = name.getDeclaredFields();
        Constructor<?>[] constructors = name.getDeclaredConstructors();
        System.out.println(name);
        for (int i = 0; i < fields.length; i++) {
            System.out.println(fields[i]);
        }
        for (int i = 0; i < constructors.length; i++) {
            System.out.println(constructors[i]);
        }
    }

}
