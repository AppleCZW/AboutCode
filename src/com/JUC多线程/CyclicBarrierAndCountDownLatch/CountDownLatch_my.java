package com.JUC多线程.CyclicBarrierAndCountDownLatch;

/*
@author cz

*/

import com.JUC多线程.CAS_unsafe.ABA_trouble;

import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CountDownLatch_my implements Runnable{
    //创建初始化3个线程的线程池
    private ExecutorService threadPool     = Executors.newFixedThreadPool(3);
    //保存每个学生的平均成绩
    private ConcurrentHashMap<String, Integer> map   = new ConcurrentHashMap<>();
    private java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(3);

    private void count() {
        for (int i = 0; i < 3; i++) {
            threadPool.execute(() -> {
                //计算每个学生的平均成绩,代码略()假设为60~100的随机数
                int score = (int) (Math.random() * 40 + 60);
                try {
                    Thread.sleep(Math.round(Math.random() * 1000));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                map.put(Thread.currentThread().getName(), score);
                System.out.println(Thread.currentThread().getName() + "同学的平均成绩为" + score);
                //有了下面这句话让三个线程相互等待下，再进行下面的run操作
                countDownLatch.countDown();
            });
        }
        this.run();
        threadPool.shutdown();
    }

    @Override
    public void run() {
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int result = 0;
        Set<String> set = map.keySet();
        for (String s : set) {
            result += map.get(s);
        }
        System.out.println("三人平均成绩为:" + (result / 3) + "分");
    }

    public static void main(String[] args) throws InterruptedException {
        long now = System.currentTimeMillis();
        CountDownLatch_my cb = new CountDownLatch_my();
        cb.count();
        Thread.sleep(100);
        long end = System.currentTimeMillis();
        System.out.println(end - now);
    }
}
