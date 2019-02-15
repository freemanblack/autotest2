package com.yiibai;

import org.testng.annotations.Test;

@Test(groups="deploy")
public class TestServer {
    public void deployServer(){
        System.out.println("Deploying Server...");
    }

    @Test(dependsOnMethods = "deployServer")
    public void deployBackUpServer(){
        System.out.println("Deploying BackUpServer...");
    }
}
