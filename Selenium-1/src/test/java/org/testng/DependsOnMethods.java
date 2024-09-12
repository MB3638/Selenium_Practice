package org.testng;

import org.testng.annotations.Test;

public class DependsOnMethods {

//    @Test
//    public void testLogin() {
//        System.out.println("Executing: testLogin");
//        Assert.fail();
//    }

    @Test(dependsOnMethods = "testLogin", alwaysRun = true, ignoreMissingDependencies = true )
    public void testNavigateToHome() {
        System.out.println("Executing: testNavigateToDashboard");
    }

    // DependsOnMethod : This means a test method will only run if the method it depends on passes.
                         // If the dependent method fails, the dependent method will be skipped.
    // But if we use alwaysRun = true then even if the dependent method fails then the dependent method will be executed.
    //ignoreMissingDependencies = true : when we use this, if the dependent method is not present it will allow to
    // run the dependent method.
}
