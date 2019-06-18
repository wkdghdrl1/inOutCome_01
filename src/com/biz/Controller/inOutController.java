package com.biz.Controller;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.biz.inout.service.InOutService_01;

public class inOutController {
	public static void main(String[] args) {
			
		String Fn = "src/com/biz/inout/매입매출.txt";
		
		InOutService_01 sService;
	
		try {
			sService = new InOutService_01(Fn);
			sService.readFile();
			sService.clacIoList();
			sService.listView();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
