package com.srikanth.designpatterns.singleton;

public class Data {
    public static void main(String[] args) {
        System.out.println("fetching data from cache");

        Cache userData1 = Cache.getCacheInstance();
        Cache userData2 = Cache.getCacheInstance();

        System.out.println("UserData 1 instance : "+userData1.hashCode());
        System.out.println("UserData 2 instance : "+userData2.hashCode());
    }
}
