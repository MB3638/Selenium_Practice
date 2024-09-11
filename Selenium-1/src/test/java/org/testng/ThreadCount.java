package org.testng;

import org.testng.annotations.Test;

public class ThreadCount {

    @Test(threadPoolSize = 3, invocationCount = 3)
    public void testMethod1() {
        System.out.println("Test Method 1: " + Thread.currentThread().getId());
    }

//    @Test
//    public void testMethod2() {
//        System.out.println("Test Method 2: " + Thread.currentThread().getId());
//    }
//
//    @Test
//    public void testMethod3() {
//        System.out.println("Test Method 3: " + Thread.currentThread().getId());
//    }
//
//    @Test
//    public void testMethod4() {
//        System.out.println("Test Method 4: " + Thread.currentThread().getId());
//    }
//
//    @Test
//    public void testMethod5() {
//        System.out.println("Test Method 5: " + Thread.currentThread().getId());
//    }
//
//    @Test
//    public void testMethod6() {
//        System.out.println("Test Method 6: " + Thread.currentThread().getId());
//    }
//
//    @Test
//    public void testMethod7() {
//        System.out.println("Test Method 7: " + Thread.currentThread().getId());
//    }
}
