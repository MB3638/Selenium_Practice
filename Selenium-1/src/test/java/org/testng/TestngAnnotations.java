package org.testng;

import org.testng.annotations.*;

public class TestngAnnotations {

    private String username;
    private String password;

    public TestngAnnotations(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @DataProvider(name = "loginData")
    public static Object[][] dataProviderMethod() {
        return new Object[][] { { "user1", "madhu" }, { "user2", "abhi" } };
    }

    // Constructor parameterization using @Factory
    @Factory(dataProvider = "loginData")
    public static Object[] createInstances(String username, String password) {
        return new Object[] { new TestngAnnotations(username, password) };
    }

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Before Suite");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("After Suite");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("Before Test");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("After Test");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("Before Class");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("After Class");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Before Method");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("After Method");
    }

    @Test(priority = 1)
    public void testLogin() {
        System.out.println("Login with username: " + username + " and password: " + password);
    }

    @Test(priority = 2)
    public void testNavigateToDashboard() {
        System.out.println("Navigate to dashboard");
    }

    @Test(priority = 4, enabled = false)
    public void testLogout() {
        System.out.println("Logout");
    }
}
