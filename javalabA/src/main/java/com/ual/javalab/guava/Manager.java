package com.ual.javalab.guava;

import com.google.common.util.concurrent.ListeningExecutorService;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.common.util.concurrent.SimpleTimeLimiter;

import java.util.concurrent.*;

public class Manager {
    private ThreadPoolExecutor pool = new ThreadPoolExecutor(20,20,0L, TimeUnit.MILLISECONDS,new ArrayBlockingQueue<>(2000));
    private ThreadPoolExecutor callbackPool = new ThreadPoolExecutor(20,20,0L,TimeUnit.MILLISECONDS,new ArrayBlockingQueue<>(2000));
    private ListeningExecutorService listeningExecutor = MoreExecutors.listeningDecorator(this.pool);
    private SimpleTimeLimiter timeLimiter = SimpleTimeLimiter.create(Executors.newCachedThreadPool());

    public static void main(String[] args) {
        ConcurrentHashMap<Object, Object> m = new ConcurrentHashMap<>();
        int MAXIMUM_CAPACITY = 1 << 30;
        System.out.println(MAXIMUM_CAPACITY);
        int m2 = MAXIMUM_CAPACITY >>> 1;
        System.out.println(m2);

    }
}
