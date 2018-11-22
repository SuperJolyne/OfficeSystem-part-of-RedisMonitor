package org.Thread;

import org.Global;
import org.Jedis.JedisMethod;

public class ThreadPub extends Thread{
    JedisMethod t = new JedisMethod();
    int count=0;

    public void run() {
        t.init();
        while (true) {
            t.testPub();
            Global.pub++;
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
