package com.gtmap.io.test;

import java.io.File;
import java.io.FileReader;

public class Test_IO_11_Char_InputStream01_FileReader {
	public static void main(String[] args) {
		//准备文件dnf.txt其中的内容是XY
		File file = new File("d:/dnf.txt");
		//创建基于文件的Reader
		try(FileReader fr = new FileReader(file)) {
			//创建字符数组，其长度就是文件长度
			char[] all = new char[(int) file.length()];
			//以字符流的形式读取文件所有内容
			fr.read(all);
			for (char c : all) {
				//打印出来是 X Y
				System.out.println(c);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}
