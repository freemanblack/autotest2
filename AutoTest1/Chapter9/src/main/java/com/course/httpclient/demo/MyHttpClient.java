package com.course.httpclient.demo;


//import com.sun.java.util.jar.pack.ConstantPool;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.testng.annotations.Test;
import sun.management.counter.perf.PerfStringCounter;

import java.io.IOException;
import java.nio.charset.Charset;

import com.sun.glass.ui.win.*;
//import com.sun.glass.ui.win.WinSystemClipboard;

//import static com.sun.glass.ui.win.WinSystemClipboard.*;
//import static com.sun.glass.ui.win.WinHTMLCodec.defaultCharset;
import static java.nio.charset.Charset.defaultCharset;

public class MyHttpClient {
    //private String defaultCharset;

    @Test
    public void test1() throws IOException {
        String result;
        //用来存放我们的结果
        HttpGet get = new HttpGet("http://www.baidu.com");
        //这个是用来执行get方法的
        HttpClient client = new DefaultHttpClient();
        HttpResponse response = client.execute(get);


        result = EntityUtils.toString(response.getEntity(),"utf-8");//注意直接写"utf-8"自动带出defaultCharset
        System.out.println(result);


    }
}
