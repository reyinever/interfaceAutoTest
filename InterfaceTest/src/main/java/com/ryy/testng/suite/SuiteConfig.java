package com.ryy.testng.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class SuiteConfig {
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("BeforSuite ...");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("AfterSuite ...");
    }

}
