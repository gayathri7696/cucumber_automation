package com.property.reader;

import java.io.IOException;

public class File_Reader_Manager {
	public Configuration_Reader get_Instance_CR() throws Throwable
	{
		Configuration_Reader reader=new Configuration_Reader();
		return reader;
	}
	public static  File_Reader_Manager get_Instance_FRM()
	{
		
		File_Reader_Manager frm=new File_Reader_Manager();
		return frm;
	}
	private File_Reader_Manager()
	{
		
	}
	

}
