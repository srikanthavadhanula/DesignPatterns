package com.srikanth.designpatterns.singleton;

public class Cache {
    private Cache() {} // private Constructor
    private static Cache cacheInstance; // private Instance
    // single point of contact
    public static Cache getCacheInstance() {
        if(cacheInstance == null) {
            cacheInstance = new Cache();
        }
        return cacheInstance;
    }
}
