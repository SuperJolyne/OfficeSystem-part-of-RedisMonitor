package org.Thread;

import org.Http.MyHttpClient;

import java.net.ConnectException;

public class ThreadHttp extends Thread{
    public void run() {
        MyHttpClient myHttpClient = new MyHttpClient();
        while (true) {

            try {
                myHttpClient.startWork();
                Thread.sleep(5000);
            } catch (Exception e) {
                System.out.println("netty连接出现问题");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e1) {
                    e1.printStackTrace();
                }
            }
        }
    }
}
