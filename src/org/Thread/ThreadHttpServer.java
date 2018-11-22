package org.Thread;

import org.Http.MyHttpServer;

import java.io.IOException;

public class ThreadHttpServer extends Thread{
    public void run(){
        MyHttpServer httpServer = new MyHttpServer();
        try {
            httpServer.myHttpserverServer();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
