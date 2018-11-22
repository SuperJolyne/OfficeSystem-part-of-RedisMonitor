package org;

import org.Differ.Differe;
import org.Thread.ThreadHttpServer;
import org.Thread.ThreadPub;

public class Main {
    public static void main(String[] args) {

        new ThreadHttpServer().start();

        new ThreadPub().start();

        Differe diff = new Differe();
        diff.monitor();
    }
}