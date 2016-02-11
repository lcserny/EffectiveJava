package com.EffectiveJava.objects;

import java.util.HashMap;

/**
 * Created by user on 11.02.2016.
 */
public class HashMapProviderTest
{
    public static void main(String[] args)
    {
        new HashMapProviderTest().run();
    }

    public void run()
    {
        HashMap<Integer, Integer> test = HashMapProvider.newInstance();
        test.put(25, 36);

        HashMap<String, String> testTwo = HashMapProvider.newInstance();
        testTwo.put("myKey", "My Value");

        System.out.println(test);
        System.out.println(testTwo);
    }
}
