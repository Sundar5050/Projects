package com.org.cb.framework.impl;

import java.util.List;



import com.org.cb.framework.FileConvert;

public class FileConvertImpl implements FileConvert {
	
	public FileConvertImpl() {
		super();
		// TODO Auto-generated constructor stub
	}


	private FileInitializeImpl fileInitialized;
	


	
	public void ReadFile(List<String> readList)
	{
		
		
		
		for (String fileName : readList)
		{
			System.out.println(fileName+"Sundar");
		}
		
		
	}

}
