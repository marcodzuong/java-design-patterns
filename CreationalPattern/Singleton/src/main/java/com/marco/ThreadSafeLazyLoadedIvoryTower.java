package com.marco;

public class ThreadSafeLazyLoadedIvoryTower {

    /**
     * Singleton instance of the class, declared as volatile to ensure atomic access by multiple threads.
     */
    private static volatile ThreadSafeLazyLoadedIvoryTower instance;

    /**
     * Private constructor to prevent instantiation from outside the class.
     */
    private ThreadSafeLazyLoadedIvoryTower() {
        // Protect against instantiation via reflection
        if (instance != null) {
            throw new IllegalStateException("Already initialized.");
        }
    }

    /**
     * The instance doesn't get created until the method is called for the first time.
     *
     * @return an instance of the class.
     */
    public static synchronized ThreadSafeLazyLoadedIvoryTower getInstance() {
        if (instance == null) {
            instance = new ThreadSafeLazyLoadedIvoryTower();
        }
        return instance;
    }
}
