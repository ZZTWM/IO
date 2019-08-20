package com.gtmap.io.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * 字节流：
 * 	InputStream字节输入流 
 * 	OutputStream字节输出流 
 * 	用于以字节的形式读取和写入数据
 *
 */
public class Test_IO_07_OutputStream {
	public static void main(String[] args) throws IOException {
		/**
		 * 以字节流的形式向文件写入数据
		 * 	OutputStream是字节输出流，同时也是抽象类，只提供方法声明，不提供方法的具体实现。
		 * 	FileOutputStream 是OutputStream子类，以FileOutputStream 为例向文件写出数据
		 * 	注: 如果文件d:/lol2.txt不存在，写出操作会自动创建该文件。 
		 * 	但是如果是文件 d:/xyz/lol2.txt，而目录xyz又不存在，会抛出异常
		 */
		try {
			// 准备文件dnf.txt其中的内容是空的
			File f = new File("d:/dnf.txt");
			//准备长度是2的字节数组，用88,89初始化，其对应的字符分别是X,Y
			byte data[] = {88,89};
			//创建基于文件的输入流
			FileOutputStream fos = new FileOutputStream(f);
			//把数据写入到输入流
			fos.write(data);
			//关闭输入流
			fos.close();
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		
	}
}
