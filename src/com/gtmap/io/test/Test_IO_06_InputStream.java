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
public class Test_IO_06_InputStream {
	public static void main(String[] args) throws IOException {
		/**
		 * 以字节流的形式读取文件内容
		 * 	InputStream是字节输入流，同时也是抽象类，只提供方法声明，不提供方法的具体实现。
		 * 	FileInputStream 是InputStream子类，以FileInputStream 为例进行文件读取
		 */
		try {
			//准备文件lol.txt其中的内容是AB，对应的ASCII分别是65 66
			File f = new File("d:/lol.txt");
			//创建基于文件的输入流
			FileInputStream fis = new FileInputStream(f);
			//创建字节数组，其长度就是文件的长度
			byte[] all = new byte[(int) f.length()];
			//以字节流的形式读取文件所有内容
			fis.read(all);
			for (byte b : all) {
				//输出的是字符的ASCII编码：65   66
				System.out.println(b);
			}
			//每次使用完流，都应该进行关闭
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}
}
