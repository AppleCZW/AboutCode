package com.JUD;

/*
@author cz

*/

/**
 * 原来的对象和拷贝之后的对象都指向不同的对象
 */
public class DeepCloneExample implements Cloneable {
    private int[] arr;

    public DeepCloneExample() {
        arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
    }

    public void set(int index, int value) {
        arr[index] = value;
    }

    public int get(int index) {
        return arr[index];
    }

    /**
     * 主要的就是在这个地方是有不一样的 每一次拷贝的都是新的地址
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected DeepCloneExample clone() throws CloneNotSupportedException {
        DeepCloneExample result = (DeepCloneExample) super.clone();
        result.arr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result.arr[i] = arr[i];
        }
        return result;
    }
}

