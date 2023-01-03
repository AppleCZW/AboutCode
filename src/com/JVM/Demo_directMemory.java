package com.JVM;

/*
@author cz

*/

import java.io.IOException;
import java.nio.ByteBuffer;

public class Demo_directMemory {
    static int _10GB = 1024*1024*1024;
    public static void main(String[] args) throws IOException {
        ByteBuffer allocate = ByteBuffer.allocate(_10GB);
        ByteBuffer allocate1 = ByteBuffer.allocate(_10GB);
        System.out.println("分配完成");
        System.in.read();
        System.out.println("开始释放");
        System.gc();
        System.in.read();
    }
}
