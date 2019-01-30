package com.lon.text;

import java.io.FileInputStream;


public class long_text {

	public static void main(String[] args) {
		String realPath ="D:/long.txt";
		try {
		FileInputStream	fis = new FileInputStream(realPath);
		byte[] content1 = new byte[fis.available()];
		fis.read(content1);
		String str = new String(content1, "GBK");
		System.out.println(str);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
