package com.gtmap.io.test;

import java.io.File;
import java.io.FileWriter;

public class Test_IO_12 {
	public static void main(String[] args) {
		//׼���ļ�lol2.txt
		File file = new File("d:/lol2.txt");
		// ���������ļ���Writer
		try(FileWriter fw = new FileWriter(file)) {
			String data = "abcdefg1234567890";
			char[] cs = data.toCharArray();
			fw.write(cs);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
