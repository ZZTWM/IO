package com.gtmap.io.test;

import java.io.File;
import java.io.FileWriter;

public class Test_IO_12 {
	public static void main(String[] args) {
		//准备文件lol2.txt
		File file = new File("d:/lol2.txt");
		// 创建基于文件的Writer
		try(FileWriter fw = new FileWriter(file)) {
			String data = "abcdefg1234567890";
			char[] cs = data.toCharArray();
			fw.write(cs);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
