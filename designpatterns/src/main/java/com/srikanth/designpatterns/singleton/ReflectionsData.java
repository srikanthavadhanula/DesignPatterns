package com.srikanth.designpatterns.singleton;

import java.lang.reflect.Constructor;

public class ReflectionsData {
    public static void main(String[] args) {
        System.out.println("Here are breaking the singleton class by using reflections");

        Cache userA = Cache.getCacheInstance();
        Cache userB = null;
        try {
            Constructor[] declaredConstructors = Cache.class.getDeclaredConstructors();
            for(Constructor constructor: declaredConstructors) {
                constructor.setAccessible(true);
                userB = (Cache) constructor.newInstance();
                break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("userA instance : "+userA.hashCode());
        System.out.println("userB instance : "+userB.hashCode());
    }
}
