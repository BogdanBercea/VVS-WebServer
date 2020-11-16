package com.bercea.java;

import org.junit.Assert;
import org.junit.Test;

public class WebServerTest {

	@Test
	public void parseCorrectPortParam_1234() {
		String[] args = new String[1];
		args[0] = "1234";
		Assert.assertEquals(1234, WebServer.getValidPortParam(args));
	}

	@Test
	public void parseCorrectPortParam_1020() {
		String[] args = new String[1];
		args[0] = "1020";
		Assert.assertEquals(1020, WebServer.getValidPortParam(args));
	}

	@Test
	public void parseCorrectPortParam_8081() {
		String[] args = new String[1];
		args[0] = "8081";
		Assert.assertEquals(8081, WebServer.getValidPortParam(args));
	}

	@Test
	public void emptyParamsDefaultTo8080() {
		String[] args = new String[0];
		Assert.assertEquals(8080, WebServer.getValidPortParam(args));
	}

	@Test(expected = NumberFormatException.class)
	public void wrongParamThrowException_asda() {
		String[] args = new String[1];
		args[0] = "asda";
		Assert.assertEquals(8080, WebServer.getValidPortParam(args));
	}

	@Test(expected = NumberFormatException.class)
	public void wrongParamThrowException_bercea() {
		String[] args = new String[1];
		args[0] = "bercea";
		Assert.assertEquals(8080, WebServer.getValidPortParam(args));
	}

	@Test(expected = NumberFormatException.class)
	public void wrongParamThrowException_isco() {
		String[] args = new String[1];
		args[0] = "isco";
		Assert.assertEquals(8080, WebServer.getValidPortParam(args));
	}

	@Test(expected = NumberFormatException.class)
	public void invalidPortThrowException() {
		String[] args = new String[1];
		args[0] = "0";
		Assert.assertEquals(8080, WebServer.getValidPortParam(args));
	}

	@Test(expected = NumberFormatException.class)
	public void invalidPortTooHighThrowException() {
		String[] args = new String[1];
		args[0] = "65535";
		Assert.assertEquals(8080, WebServer.getValidPortParam(args));
	}

}
