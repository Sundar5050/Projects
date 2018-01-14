package com.org.cb.framework.impl;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.springframework.beans.factory.annotation.Value;

import com.org.cb.common.CBStandardKeys;
import com.org.cb.common.ExceptionUtil;

public class FileInitializeImpl {
	
	//private Properties billLocation = null;
	public FileInitializeImpl(String billLocation) throws Exception {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("Inside FileIniatilize constructor.");
		File directory = new File(billLocation);
		System.out.println(directory); 
		if(directory.exists()){
			  System.out.println("File existed");
		  }else{
			  System.out.println("File not found!");
			  throw new ExceptionUtil("No files Found");
		  }
	}

	private List<String> inputFileList = new ArrayList<String>();

	public void listFiles(String directoryName) {

		File directory = new File(directoryName);
		File[] fList = directory.listFiles();

		System.out.println("Sundar add file names to List" + directoryName );

		for (File file : fList) {

			System.out.println(file.getName().toString());
			inputFileList.add(file.getName().toString());


		}

	}

	public List<String> getinputFileList() {
		System.out.println(inputFileList.size());
		return inputFileList;
	}

	public void setinputFileList(List<String> arrayList) {
		this.inputFileList = arrayList;
	}

	/*public Properties getBillLocation() {
		return billLocation;
	}

	public void setBillLocation(Properties billLocation) {
		this.billLocation = billLocation;
	} */

}
