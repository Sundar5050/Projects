package com.org.cb.framework.impl;

import java.util.ArrayList;
import java.util.List;

import com.org.cb.common.CBStandardKeys;
import com.org.cb.framework.FileHandling;

public class FileHandlingImpl implements FileHandling{
	
	private String billLocation = null;

	public String getBillLocation() {
		return billLocation;
	}


	public void setBillLocation(String billLocation) {
		this.billLocation = billLocation;
	}


	public FileHandlingImpl() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	private FileInitializeImpl fileInitialized = null;
	private FileConvertImpl fileConvert = null;
	

	
	public FileHandlingImpl( FileInitializeImpl fileInitialized)
	{
		 System.out.println("Inside FileHandling constructor." );
		 this.fileInitialized = fileInitialized;
	}
	

	public void FileHandling ()
	{
		System.out.println("Sundar" + billLocation);
		//System.out.println(CBStandardKeys.inboundPath);
        fileInitialized.listFiles(billLocation);
        
        fileConvert = new FileConvertImpl();
        fileConvert.ReadFile(fileInitialized.getinputFileList());
        
        
        
	}
	
	

}
