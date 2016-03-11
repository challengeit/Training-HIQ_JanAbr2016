package exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;


import org.junit.Assert;
import org.junit.Test;

public class ExceptionTestCase 
{	
	/* BAD CODE!
	public static int innerXpto() {
		System.out.println("hey");
		return 1;
	}
	
	public static int xpto() {
		try {
			InputStream inputFile = new FileInputStream("/resources/example.txt");
		}
		catch(IOException e) {
			return innerXpto();
		}
		finally {
			System.out.println("1");
			return 1;
		}
	}
	
	@Test
	public void testCatchReturn() {
		Assert.assertEquals(1, xpto());
		Assert.assertEquals(0, xpto());
	}
	 */
	
	@Test
	public void testMultiCatch() 
	{
		char result = '0', ee = '0';
		try
		{
			InputStream inputFile = new FileInputStream("resources/example.txt");
			int data = inputFile.read();
			result = (char) data;
			ee = (char) inputFile.read();
			inputFile.close();
		}
		catch(FileNotFoundException e) {
			Assert.assertTrue(e.getMessage(), false);
		}
		catch(IOException e) {
			Assert.assertTrue(e.getMessage(), false);
		}

		Assert.assertNotEquals('0', result);
		Assert.assertEquals('H', result);
		Assert.assertEquals('e', ee);
	}
	
	@Test
	public void testFinally() 
	{
		InputStream inputFile = null;
		char result = '0';
		try
		{
			inputFile = new FileInputStream("/resources/example.txt");
			int data = inputFile.read();
			result = (char) data;
		}
		catch(IOException e) {
			Assert.assertTrue(e.getMessage(), false);
		}
		finally {			
			try { if(inputFile != null) inputFile.close(); } 
			catch (IOException e) 
			{ 
				Assert.assertTrue(e.getMessage(), false);
			}
		}

		Assert.assertNotEquals('0', result);
		Assert.assertEquals('H', result);
	}
	
	@Test
	public void testTryWithResources() 
	{
		char result = '0';
		try(InputStream inputFile = new FileInputStream("/resources/example.txt");
			InputStream input = new FileInputStream("/resources/example.txt");
			InputStream in = new FileInputStream("/resources/example.txt");
		)
		{
			int data = inputFile.read();
			result = (char) data;
		}
		// close
		catch(IOException e) {
			Assert.assertTrue(e.getMessage(), false);
		}

		Assert.assertNotEquals('0', result);
		Assert.assertEquals('H', result);
	}
}