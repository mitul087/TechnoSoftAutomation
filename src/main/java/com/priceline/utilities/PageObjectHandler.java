package com.priceline.utilities;

import com.priceline.pageObjects.Demo;
import com.priceline.pageObjects.Header;

public abstract class PageObjectHandler {
	
	/*
	 * Object For Demo Page
	 * Arafat Mamun
	 * 08-11-2016 13:31
	 */
	public static Demo demo(){
		Demo demo = new Demo();
		return demo;
	}
	
	/*
	 * Object For Header Page
	 * Arafat Mamun
	 * 08-11-2016 13:31
	 */
	public static Header header(){
		Header header = new Header();
		return header;
	}
}
