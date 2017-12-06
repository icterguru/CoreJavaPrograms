package com;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Date; 

public class BaskarException extends Exception
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public void writeToText(String message)
	{
		writeToFile("C:/Baskar/Java/out1.txt",message+"Created at"+new Date());
		System.out.println(message);
	}
	static public void writeToFile(String filePath, String filecontent)
	{
		try 
		{
			// Create File
			FileWriter fstream=new FileWriter("C:/Baskar/Java/out1.txt");
			BufferedWriter out=new BufferedWriter(fstream);
			out.write(filecontent);
			out.close();   //close the output stream
		} 
		catch (Exception e) 
		{
			//catch Exceptioin if any
			System.err.println("Error :"+e.getMessage());
		}
	}
}