package com.course.testng;

import org.testng.annotations.Test;

public class IgnoreTest {

    @Test
    public void Ignore1(){
        System.out.println("Ignore1执行了");
    }

    @Test(enabled = false)//设置不执行
    public void Ignore2(){
        System.out.println("Ignore2执行了");
    }

    @Test(enabled = true)
    public void Ignore3(){
        System.out.println("Ignore3执行了");
    }
}
