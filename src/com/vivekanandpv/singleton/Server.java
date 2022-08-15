package com.vivekanandpv.singleton;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Server {
    private volatile static Server instance;
    private static final Lock lock = new ReentrantLock();

    private Server() {

    }

    public static Server getInstance() {
        if (instance == null) {
            synchronized(lock) {
                if (instance == null) {
                    instance = new Server();
                }
            }
        }

        return instance;
    }
}
