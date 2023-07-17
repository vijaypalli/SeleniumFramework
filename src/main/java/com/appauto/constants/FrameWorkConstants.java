package com.appauto.constants;

public final class FrameWorkConstants {
	
	private FrameWorkConstants() {
		
	}

	private static final String CHROMEDRIVERPATH = System.getProperty("user.dir")+"/src/test/resources/executables/chromedriver.exe";
	
	public static String getChromedriverPath() {
		return CHROMEDRIVERPATH;
	}
}
