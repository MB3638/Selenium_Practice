package org.testng;

import org.testng.annotations.Test;

public class Groups {

    @Test(groups = {"userName", "password"})
    public void testUserRegistration() {
        System.out.println("User is Registering with userName + password");
    }

    @Test(groups = {"userName"})
    public void testLoginWithValidCredentials() {
        System.out.println("User is Logging In");
    }

    @Test(groups = {"password"})
    public void testUserPasswordChange() {
        System.out.println("User entering Password");
    }

    @Test(groups = {"logout"})
    public void testLogout() {
        System.out.println("User is Logging Out");
    }

    @Test(enabled = false) // we use this "enabled = false" to skip the test from executing. we also use @Ignore instead of this
    public void testUser() {
        System.out.println("Testing User");
    }

    // If we do @Test(enabled = false) at class level and if we do @Test for one of the methods
    // individually that particular method with @Test annotation will be executed because it accepts @Test at method level first
    // If we do @Ignore at class level, it will ignore all the test cases, it won't execute even we do @Test at method level.
}
