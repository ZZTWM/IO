package com.gtmap.io.exercise;

import java.io.File;
import java.io.FileOutputStream;
/**
 * 写入数据到文件：
 * 	以字节流的形式向文件写入数据 中的例子，当lol2.txt不存在的时候，是会自动创建lol2.txt文件的。
 * 	但是，如果是写入数据到d:/xyz/lol2.txt，而目录xyz又不存在的话，就会抛出异常。
 * 	那么怎么自动创建xyz目录？
 * 	如果是多层目录 d:/xyz/abc/def/lol2.txt 呢？
 * @author Administrator
 *
 */
public class Exercise03_WriteDateToFile {
	public static void main(String[] args) {
		
		try {
			//因为默认情况下，文件系统中不存在 d:\xyz\abc\def，所以输出会失败
			File f = new File("d:/xyz/abc/def/wow.txt");
			//首先获取文件所在的目录
			File dir = f.getParentFile();
			//System.out.println(dir);
			if(!dir.exists()){
				//dir.mkdir(); //使用mkdir会抛出异常，因为该目录的父目录也不存在
				dir.mkdirs();//使用mkdirs则会把不存在的目录都创建好
			}
			
			byte data[] = {88,89};
			FileOutputStream fos = new FileOutputStream(f);
			fos.write(data);
			fos.close();
			
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		
	}
}
