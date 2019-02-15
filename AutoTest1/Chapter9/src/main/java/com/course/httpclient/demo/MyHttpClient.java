package com.course.httpclient.demo;


import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.testng.annotations.Test;
import sun.management.counter.perf.PerfStringCounter;

import java.io.IOException;
import com.sun.glass.ui.win.*;
//import com.sun.glass.ui.win.WinSystemClipboard;

//import static com.sun.glass.ui.win.WinSystemClipboard.*;
import static java.nio.charset.Charset.defaultCharset;

public class MyHttpClient {
    //private String defaultCharset;

    @Test
    public void test1() throws IOException {
        //用来存放我们的结果
        String result;
        HttpGet get = new HttpGet("http://www.baidu.com");
        //这个是用来执行get方法的
        HttpClient client = new DefaultHttpClient();
        HttpResponse response = client.execute(get);

        result = EntityUtils.toString(response.getEntity(), defaultCharset:"utf-8");

        //result = EntityUtils.toString(response.getEntity());
        System.out.println(result);


    }
}
