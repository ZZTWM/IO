package com.gtmap.io.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * 什么是流：
 * 	什么是流(Stream)，流就是一系列的数据
 * 	当不同的介质之间有数据交互的时候，JAVA就使用流来实现。
 * 	数据源可以是文件，还可以是数据库，网络甚至是其他的程序
 * 	比如读取文件的数据到程序中，站在程序的角度来看，就叫做输入流
 * 	输入流： InputStream
 * 	输出流：OutputStream
 * @author Administrator
 *
 */
public class Test_IO_05_FileOutputStream {
	public static void main(String[] args) throws IOException {
		/**
		 * 文件输出流
		 */
		try {
			File f = new File("d:/lol.txt");
			//创建基于文件的输入流
			FileOutputStream fos = new FileOutputStream(f);			
			// 通过这个输入流，就可以把数据从硬盘，读取到Java的虚拟机中来，也就是读取到内存中
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
