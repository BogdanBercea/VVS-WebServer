package com.bercea.java.http;

import org.junit.Assert;
import org.junit.Test;

public class ContentTypeTest {

	@Test
	public void GetCorrectCSSContentTypeByExtension(){
		Assert.assertEquals(ContentType.CSS, ContentType.valueOf("CSS"));
	}
	@Test
	public void GetCorrectGIFContentTypeByExtension(){
		Assert.assertEquals(ContentType.GIF, ContentType.valueOf("GIF"));
	}

	@Test
	public void GetCorrectHTMContentTypeByExtension(){
		Assert.assertEquals(ContentType.HTM, ContentType.valueOf("HTM"));
	}

	@Test
	public void GetCorrectHTMLContentTypeByExtension(){
		Assert.assertEquals(ContentType.HTML, ContentType.valueOf("HTML"));
	}

	@Test
	public void GetCorrectICOContentTypeByExtension(){
		Assert.assertEquals(ContentType.ICO, ContentType.valueOf("ICO"));
	}

	@Test
	public void GetCorrectTXTContentTypeByExtension(){
		Assert.assertEquals(ContentType.TXT, ContentType.valueOf("TXT"));
	}

	@Test
	public void GetCorrectJPGContentTypeByExtension(){
		Assert.assertEquals(ContentType.JPG, ContentType.valueOf("JPG"));
	}

	@Test
	public void GetCorrectJPEGContentTypeByExtension(){
		Assert.assertEquals(ContentType.JPEG, ContentType.valueOf("JPEG"));
	}

	@Test
	public void GetCorrectPNGContentTypeByExtension(){
		Assert.assertEquals(ContentType.PNG, ContentType.valueOf("PNG"));
	}

	@Test
	public void GetCorrectXMLContentTypeByExtension(){
		Assert.assertEquals(ContentType.XML, ContentType.valueOf("XML"));
	}

}
