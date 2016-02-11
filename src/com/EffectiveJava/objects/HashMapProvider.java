package com.EffectiveJava.objects;

import java.util.HashMap;

/**
 * Created by user on 11.02.2016.
 */
public class HashMapProvider
{
    private HashMapProvider() {}

    public static <K, V> HashMap<K, V> newInstance()
    {
        return new HashMap<K, V>();
    }
}
