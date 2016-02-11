package com.EffectiveJava.objects;

import java.util.HashMap;

/**
 * Created by user on 11.02.2016.
 */
public class CustomHashMapTest
{
    public static void main(String[] args)
    {
        new CustomHashMapTest().run();
    }

    public void run()
    {
        HashMap test = CustomHashMap.newInstance();
        test.put("myKey", "My Value");

        System.out.println(test);
    }
}
