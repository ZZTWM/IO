package com.gtmap.io.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 使用缓存流写出数据:
 * PrintWriter 缓存字符输出流， 可以一次写出一行数据
 * @author Administrator
 *
 */
public class Test_IO_14_PrintWriter {
	public static void main(String[] args) {
		//向文件lol2.txt中写入三行语句
		File file = new File("d:/lol2.txt");
		try(
				// 创建文件字符流
				FileWriter fw = new FileWriter(file);
				// 缓存流必须建立在一个存在的流的基础上
				PrintWriter pw = new PrintWriter(file);
			)
		{
			pw.println("garen kill teemo");
			pw.println("teemo revive after 1 minutes");
			pw.println("teemo try to garen, but killed again");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
}
