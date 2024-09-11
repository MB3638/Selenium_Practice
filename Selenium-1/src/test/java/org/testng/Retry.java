package org.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Retry {

    @Test(retryAnalyzer = RetryAnalyzer.class)
    public  void Test1(){
        System.out.println("Method will be failed");
        Assert.fail();
    }
}
