package exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.junit.Assert;
import org.junit.Test;

public class ExceptionTestCase 
{	
	public static int m1() { return 1; }
	
	/* BAD CODE! /
	public static int innerXpto() {
		System.out.println("hey");
		return 1;
	}
		
	public static int xpto() throws MyException, IOException {
		//if(m1() == 1) throw new IOException();
		try {
			InputStream inputFile = new FileInputStream("/resources/example.txt");
		}
		catch(IOException e) {
			throw new IOException();
			//return innerXpto();
		}
		finally {
			System.out.println("1");
			throw new MyException();
			//return 1;
		}
		//return 0;
		//System.exit(0); -> finally not execute.
	}
	
	@Test
	public void testCatchReturn() throws MyException, IOException {
		Assert.assertEquals(1, xpto());
		Assert.assertEquals(0, xpto());
	}
	 /*/
	
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
			inputFile = new FileInputStream("resources/example.txt");
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
		try(InputStream inputFile = new FileInputStream("resources/example.txt");
			InputStream input = new FileInputStream("resources/example.txt");
			InputStream in = new FileInputStream("resources/example.txt");
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
	
	@Test
	public void testAssertions() 
	{		
		assert m1() == 1;
		
		assert false;
		
		assert m1() != 1 : "method m1 return invalid";
		
		System.out.println("end");
	}
}