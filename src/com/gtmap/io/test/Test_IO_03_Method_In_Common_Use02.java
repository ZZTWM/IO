package com.gtmap.io.test;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 文件对象：
 * 	文件和文件夹都是用File代表
 * 	文件常用方法2：
 * @author Administrator
 *
 */
public class Test_IO_03_Method_In_Common_Use02 {
	public static void main(String[] args) throws IOException {
		File f = new File("d:/LOLFolder/skin/garen");
		//1、以字符串数组的形式，返回当前文件夹下的所有文件（不包含子文件及子文件夹）
		String[] str = f.list();
		System.out.println(str.length);
		
		//2、以文件数组的形式，返回当前文件夹下的所有文件（不包含子文件及子文件夹）
		File[]fs= f.listFiles();
		
		//3、以字符串形式返回获取所在文件夹的父文件夹：上一级目录
		String str2 = f.getParent();
		System.out.println(str2);
		
		//4、以文件形式返回获取所在文件夹
		f.getParentFile();
		
		//5、创建文件夹，如果父文件夹skin不存在，创建就无效
		f.mkdir();
		
		//6、创建文件夹，如果父文件夹skin不存在，就会创建父文件夹
		f.mkdirs();
		
		//7、创建一个空文件,如果父文件夹skin不存在，就会抛出异常
		f.createNewFile();
		
		//8、所以创建一个空文件之前，通常都会创建父目录
		f.getParentFile().mkdirs();
		
		//9、列出所有的盘符c: d: e: 等等
		f.listRoots();
		
		//10、删除文件
		f.delete();
		
		//11、JVM结束的时候，删除文件，常用于临时文件的删除
		f.deleteOnExit();
	}
}
