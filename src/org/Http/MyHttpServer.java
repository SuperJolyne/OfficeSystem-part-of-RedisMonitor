package org.Http;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.spi.HttpServerProvider;
import org.Global;

import java.io.IOException;
import java.net.InetSocketAddress;

public class MyHttpServer {

    public void myHttpserverServer() throws IOException {

        HttpServerProvider provider = HttpServerProvider.provider();
        HttpServer server = provider.createHttpServer(new InetSocketAddress(7778),100);
        server.createContext("/heartBeat",new MyHttpHandler());
        server.setExecutor(null);
        server.start();
        System.out.println("start");
    }

    static class MyHttpHandler implements HttpHandler {

        public void handle(HttpExchange httpExchange) throws IOException {
            httpExchange.sendResponseHeaders(200,0);
            Global.sub++;
            httpExchange.close();
        }
    }
}
