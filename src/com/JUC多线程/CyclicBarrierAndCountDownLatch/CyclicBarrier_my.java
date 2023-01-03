package com.JUC多线程.CyclicBarrierAndCountDownLatch;

/*
@author cz

*/

import java.util.Set;
import java.util.concurrent.*;

/**
 * 不会阻塞主线程
 * 区别如下
 * CountDownLatch的计数器只能使用一次。而CyclicBarrier的计数器可以使用reset()
 * 方法重置。所以CyclicBarrier能处理更为复杂的业务场景，比如如果计算发生错误，可以重置计数器，并让线程们重新执行一次。
 * CyclicBarrier还提供其他有用的方法，比如getNumberWaiting方法可以获得CyclicBarrier阻塞的线程数量。isBroken方法用来知道阻塞的线程是否被中断。比如以下代码执行完之后会返回true。
 * CountDownLatch会阻塞主线程，CyclicBarrier不会阻塞主线程，只会阻塞子线程。
 * 某线程中断CyclicBarrier会抛出异常，避免了所有线程无限等待
 */
public class CyclicBarrier_my implements Runnable{
    //创建初始化3个线程的线程池
    private ExecutorService threadPool     = Executors.newFixedThreadPool(3);
    //创建3个CyclicBarrier对象,执行完后执行当前类的run方法
    private CyclicBarrier cb             = new CyclicBarrier(3, this);
    //保存每个学生的平均成绩
    private ConcurrentHashMap<String, Integer> map            = new ConcurrentHashMap<>();

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
                try {
                    //执行完运行await(),等待所有学生平均成绩都计算完毕
                    cb.await();
                } catch (InterruptedException | BrokenBarrierException e) {
                    e.printStackTrace();
                }
            });
        }
        threadPool.shutdown();
    }

    @Override
    public void run() {
        int result = 0;
        Set<String> set = map.keySet();
        for (String s : set) {
            result += map.get(s);
        }
        System.out.println("三人平均成绩为:" + (result / 3) + "分");
    }

    public static void main(String[] args) throws InterruptedException {
        long now = System.currentTimeMillis();
        CyclicBarrier_my cb = new CyclicBarrier_my();
        cb.count();
        Thread.sleep(100);
        long end = System.currentTimeMillis();
        System.out.println(end - now);
    }

}
