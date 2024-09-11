package org.testng;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {

    int iniCount =0;
    int maxCount =3;

    @Override
    public boolean retry(ITestResult iTestResult) {
        if(iniCount<maxCount){
            iniCount++;
            return  true;
        }
        return false;
    }
}
