package com.gtmap.io.test;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 文件对象：
 * 	文件和文件夹都是用File代表
 * 	文件常用方法1：
 * @author Administrator
 *
 */
public class Test_IO_02_Method_In_Common_Use01 {
	public static void main(String[] args) {
		/**
		 * 注意1： 需要在D:\LOLFolder确实存在一个LOL.exe,才可以看到对应的文件长度、修改时间等信息
		 * 注意2： renameTo方法用于对物理文件名称进行修改，但是并不会修改File对象的name属性。
		 */
		File f = new File("d:/LOLFolder/LOL.exe");
		System.out.println("当前文件是：" + f);
		
		//1、文件是否存在
		System.out.println("判断文件是否存在：" + f.exists());
		
		//2、是否是文件夹
		System.out.println("判断是否是文件夹：" + f.isDirectory());
		
		//3、是否是文件（非文件夹）
		System.out.println("判断是否是文件：" + f.isFile());
		
		//4、文件长度
		System.out.println("文件长度：" + f.length());
		
		//5、文件最后修改时间
		long time1 = f.lastModified();
		Date date = new Date(time1);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
		String strDate = sdf.format(date);
		System.out.println("获取文件最后修改时间：" + strDate);
		
		//6、设置文件修改修改时间为 1970.1.1 08:00:00
		f.setLastModified(0);
		long time2 = f.lastModified();
		Date date2 = new Date(time2);
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
		String strDate2 = sdf2.format(date2);
		System.out.println("修改后的文件时间为：" + strDate2);
		
		//7、文件重命名
		File f2 = new File("d:/LOLFolder/DOTA.exe");
		f.renameTo(f2);
		System.out.println("把LOL.exe改名成了DOTA.exe");
		
		System.out.println("注意： 需要在D:\\LOLFolder确实存在一个LOL.exe,\r\n才可以看到对应的文件长度、修改时间等信息");
		
	}
}
