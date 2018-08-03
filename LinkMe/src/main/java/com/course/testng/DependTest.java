package com.course.testng;

import org.testng.annotations.Test;

/**
 * 依赖执行，执行上一个成功后再执行下一个；如果失败则停止执行
 */
public class DependTest {

    @Test
    public void test1(){
        System.out.println("test1 run");
        throw new RuntimeException();//抛出异常
    }
    @Test(dependsOnMethods ={"test1"} )
    public void test2(){
        System.out.println("test2 run");
    }
}
