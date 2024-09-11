package org.testng;

import org.testng.annotations.Test;

public class MetaGroup {

    @Test(groups = {"groupA"})
    public void testMethod1() {
        System.out.println("Test Method 1 in groupA");
    }

    @Test(groups = {"groupB"})
    public void testMethod2() {
        System.out.println("Test Method 2 in groupB");
    }

    @Test(groups = {"groupC"})
    public void testMethod3() {
        System.out.println("Test Method 3 in groupC");
    }
}
