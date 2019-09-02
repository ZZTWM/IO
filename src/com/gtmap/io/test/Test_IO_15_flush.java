package com.gtmap.io.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
/**
 * 有的时候，需要立即把数据写入到硬盘，而不是等缓存满了才写出去。 这时候就需要用到flush
 * @author Administrator
 *
 */
public class Test_IO_15_flush {
	public static void main(String[] args) {
		// 向文件lol2.txt中写入三行语句
		File file = new File("d:/lol2.txt");
		//创建文件字符流
		//缓存流必须建立在一个存在的流的基础上
		try(FileWriter fw = new FileWriter(file);PrintWriter pw = new PrintWriter(fw)){
			pw.println("garen kill teemo");
			pw.flush();
			pw.println("teemo revive after 1 minutes");
			pw.flush();
			pw.println("teemo try to garen, but killed again");
			pw.flush();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
}
