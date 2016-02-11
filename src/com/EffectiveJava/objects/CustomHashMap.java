package com.EffectiveJava.objects;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by user on 11.02.2016.
 */
public class CustomHashMap
{
    private CustomHashMap() {}

    public static <K, V> HashMap<K, V> newInstance()
    {
        return new HashMap<K, V>();
    }
}
