package org.testng;

import org.testng.annotations.Test;

public class RegularExpression {

    @Test(groups = {"classic_art"})
    public void testMethod1() {
        System.out.println("Test Method 1 in classic_art");
    }

    @Test(groups = {"classic_paint"})
    public void testMethod2() {
        System.out.println("Test Method 2 in classic_paint");
    }

    @Test(groups = {"classic_theme"})
    public void testMethod3() {
        System.out.println("Test Method 3 in classic_theme");
    }
}
