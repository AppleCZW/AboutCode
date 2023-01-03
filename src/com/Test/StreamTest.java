package com.Test;

/*
@author cz

*/

import java.util.*;

public class StreamTest {
     static Vector<Integer>  integers = new Vector<>();
     static int[] res1;
    public static void main(String[] args) {

        LinkedList<Integer> track = new LinkedList<>();

        track.add(1);
        track.add(2);
        track.removeLast();

        for (int i = 0; i < track.size(); i++) {
            System.out.printf("track"+track.get(i));
        }
        int[] t = new int[2];
        t[0]=1;
        t[1]=2;

        for (int i = 0; i < t.length; i++) {
            integers.add(t[i]);
        }
        for (int i = 0; i < integers.size(); i++) {
            System.out.println( integers.get(i));
        }
        Vector vector = new Vector();
        vector.add(1);
        vector.setElementAt((int)vector.get(0)+1,0);
        System.out.println(vector.get(0));

    }
}
