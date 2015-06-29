package com.seleniumwebdriver.suite.cart;

import org.testng.SkipException;
import org.testng.annotations.BeforeSuite;

import com.seleniumwebdriver.base.TestBase;
import com.seleniumwebdriver.util.TestUtil;

public class TestSuiteBase extends TestBase{

	// check if the suite ex has to be skiped
		@BeforeSuite
		public void checkSuiteSkip() throws Exception{
			initialize();
			APP_LOGS.debug("Checking Runmode of Cart Suite");
			if(!TestUtil.isSuiteRunnable(suiteXls, "Cart Suite")){
				APP_LOGS.debug("Skipped Cart Suite as the runmode was set to NO");
				throw new SkipException("RUnmode of Cart Suite set to no. So Skipping all tests in Suite A");
			}
			
		}
}
