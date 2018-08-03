package com.course.testng;

import org.testng.annotations.*;

public class BasicAnnotation {

    //基本注解，把方法标记为测试的一部分
    @Test
    public void testcase1(){
        System.out.println("测试用例1");
    }
    @Test
    public void testCase2(){
        System.out.println("测试用例2");
    }
    @BeforeMethod
    public void beForeMethod(){
        System.out.println("BeforeMethod--测试方法之前运行的方法");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("AfterMethod--测试方法之后运行的方法");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("BeforeClass--类之前运行的方法");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("AfterClass--类运行之后运行的方法");
    }
    @BeforeSuite
    public void beforSuite(){
        System.out.println("BeforeSuite--测试套件");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("AfterSuite--测试套件");
    }
}

