package com.tiger.generics;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLib {
	public String getpropertyvalue(String key) throws IOException{
		FileInputStream fs=new FileInputStream("./data/ayesha.property");
		Properties p=new Properties();
		p.load(fs);
		String vlaue = p.getProperty(key);
		return vlaue;
	}
	public String getexcelvalue(String sheetname,int rownum,int cellnum) throws EncryptedDocumentException, IOException, InvalidFormatException{
		FileInputStream fs=new FileInputStream("./data/excel.xlsx");
		Workbook w=WorkbookFactory.create(fs);
		    String value = w.getSheet(sheetname).getRow(rownum).getCell(cellnum).toString();
		   return value;
		   
	}

}
