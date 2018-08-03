package com.course.testng.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;


//套件测试
public class SuiteConfig {

    @BeforeSuite
    public void beforSuite(){
        System.out.println("befor suite运行了");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("after suite运行了");
    }
    @BeforeTest
    public void beforTest(){
        System.out.println("befor test运行了");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("after test运行了");
    }
}
