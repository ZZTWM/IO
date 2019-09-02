package com.gtmap.io.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 * 使用缓存流读取数据：缓存字符输入流 BufferedReader 可以一次读取一行数据
 * @author Administrator
 *
 */
public class Test_IO_13_BufferReader {
	public static void main(String[] args) {
		// 准备lol.txt其中的内容是
		// gareen kill teemo
		// teemo revive after 1 minutes
		// teemo try to garen,but killed again
		File file = new File("d:/lol.txt");
		try(
		        // 创建文件字符流
		        // 缓存流必须建立在一个存在的流的基础上
				FileReader fr = new FileReader(file);
				BufferedReader br = new BufferedReader(fr);
			) 
		{
			while(true){
				//一次读一行
				String line = br.readLine();
				if(null == line)
					break;
				System.out.println(line);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
