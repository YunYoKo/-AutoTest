package com.course.testng;

import org.testng.annotations.Test;

public class ExceptionTest {
    /**
     * 什么时候进行异常测试
     * 期望一个异常结果
     * 例：我们传入不合法参数，程序抛出异常
     */
// 一个失败的异常测试
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionFalid(){
        System.out.println("失败的异常测试");
    }

    // 一个成功的异常测试
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionSuccess(){
        System.out.println("成功的异常测试");
        throw new RuntimeException();
    }


}
