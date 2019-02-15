package com.yiibai;

import org.testng.annotations.Test;

@Test(groups="db",dependsOnGroups = "deploy")
public class TestDatabase {
    public void initDB(){
        System.out.println("This is initDB");
    }

    @Test(dependsOnMethods = {"initDB"},groups = "db")
    public void testConnection(){
        System.out.println("This is testConnection");
        //throw new RuntimeException();

    }
}
