package com.gtmap.io.test;

import java.io.File;
/**
 * 文件对象：
 * 	文件和文件夹都是用File代表
 * 	
 * @author Administrator
 *
 */
public class Test_IO_01_Create_A_File_Object {
	public static void main(String[] args) {
		/**
		 * 创建一个文件对象：
		 * 	使用绝对路径或者相对路径创建File对象
		 */
		//使用绝对路径创建一个文件对象
		File f1 = new File("d:/LoLFolder");
		System.out.println("f1的绝对路径：" + f1.getAbsolutePath());
		
		//使用相对路径创建一个文件对象
		File f2 = new File("LOL.exe");
		System.out.println("f2的绝对路径：" + f2.getAbsolutePath());
		
		//把f1作为父目录创建文件对象
		File f3 = new File(f1,"DNF.exe");
		System.out.println("f3的绝对路径：" + f3.getAbsolutePath());
	}
}
