package org.Http;

import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class MyHttpClient {

    public String startWork() throws Exception {
        URL url = new URL("http://127.0.0.1:7777/heartBeat");
        HttpURLConnection urlConn = (HttpURLConnection) url.openConnection();
        urlConn.setDoOutput(true);
        String str = "beat";
        OutputStream out = urlConn.getOutputStream();
        out.write(str.getBytes());
        out.flush();
        out.close();
        urlConn.getResponseCode();
        urlConn.disconnect();
        return "ok";
    }

    public void reWork() throws Exception{
        URL url = new URL("http://127.0.0.1:7777/heartBeat");
        HttpURLConnection urlConn = (HttpURLConnection) url.openConnection();
        urlConn.setDoOutput(true);
        String str = "rework";
        OutputStream out = urlConn.getOutputStream();
        out.write(str.getBytes());
        out.flush();
        out.close();
        urlConn.getResponseCode();
        urlConn.disconnect();
    }
}
