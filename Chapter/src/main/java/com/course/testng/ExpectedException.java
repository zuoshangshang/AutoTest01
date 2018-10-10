package com.course.testng;

import org.testng.annotations.Test;

public class ExpectedException {
    /*
  传入不合法参数，程序跑出异常
  也就是预期结果就是异常
   */
    //这是一个结果失败的异常测试
     @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionFailed(){
        System.out.println("这是一场异常测试，失败的");
    }
    //这是一个成功的异常测试
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionSuccess(){
        System.out.println("这是成功的异常测试");
        throw new RuntimeException();
    }
}
