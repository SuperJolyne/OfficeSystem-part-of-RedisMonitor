package org.Differ;

import org.Global;
import org.Http.MyHttpClient;

import java.io.IOException;

public class Differe {

    public void monitor() {
        while (true){
            int pub = Global.pub;
            System.out.println(pub);
            int sub = Global.sub;
            System.out.println(sub);
            int diff = Math.abs(pub-sub);
            System.out.println(diff);
            try {
                if(3<diff){
                    try {
                        MyHttpClient client = new MyHttpClient();
                        String s = client.startWork();
                        if(s.equals("ok")){
                            client.reWork();
                            Global.sub=-1;
                            Global.pub=0;
                        }
                    } catch (Exception e){
                        e.printStackTrace();
                            Process pro = Runtime.getRuntime().exec("/home/super/crontab/nettyTest.sh");
                            Global.sub=0;
                            Global.pub=0;
                            Thread.sleep(5000);
                    }
                    Thread.sleep(5000);
                }else {
                   Thread.sleep(5000);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
