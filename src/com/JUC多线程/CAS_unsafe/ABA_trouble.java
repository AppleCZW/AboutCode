package com.JUC多线程.CAS_unsafe;

/*
@author cz

*/

import com.JUD.ThreadUnsafe;

import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 因为CAS需要在操作值的时候，检查值有没有发生变化，比如没有发生变化则更新，
 * 但是如果一个值原来是A，变成了B，又变成了A，
 * 那么使用CAS进行检查时则会发现它的值没有发生变化，但是实际上却变化了。
 *
 * ABA问题的解决思路就是使用版本号。在变量前面追加上版本号，
 * 每次变量更新的时候把版本号加1，那么A->B->A就会变成1A->2B->3A。
 */
public class ABA_trouble {


}
