package com.srikanth.designpatterns.singleton;

public class ThreadSafeCache {
    private ThreadSafeCache() {} // private Constructor
    private static ThreadSafeCache cacheInstance; // private Instance
    // Thread safe single point of contact
    public static ThreadSafeCache getCacheInstance() {
        if(cacheInstance == null) {
            synchronized (ThreadSafeCache.class) {
                if(cacheInstance == null)
                    cacheInstance = new ThreadSafeCache();
            }
        }
        return cacheInstance;
    }
}
