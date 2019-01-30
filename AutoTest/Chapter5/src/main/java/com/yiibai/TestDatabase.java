package com.yiibai;

import org.testng.annotations.Test;

@Test(groups = "db",dependsOnGroups = "deploy")
public class TestDatabase {
    public void intDB(){
        System.out.println("This is intDB");
    }

    @Test(dependsOnMethods = {"intDB"},groups = "db")
    public void testConnection(){
        System.out.println("This is testConnection");
    }
}
