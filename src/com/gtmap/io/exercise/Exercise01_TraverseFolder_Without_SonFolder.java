package com.gtmap.io.exercise;

import java.io.File;
/**
 * 遍历C盘windows文件夹下文件，不用遍历子文件夹，找最大的文件和最小的文件，并输出大小
 * 一般说来操作系统都会安装在C盘，所以会有一个 C:\WINDOWS目录。
 * 	遍历这个目录下所有的文件(不用遍历子目录)
 * 	找出这些文件里，最大的和最小(非0)的那个文件，打印出他们的文件名
 * 	注: 最小的文件不能是0长度
 * @author Administrator
 *
 */
public class Exercise01_TraverseFolder_Without_SonFolder {
	public static void main(String[] args) {
		File f = new File("c:\\windows");
		File[] fs = f.listFiles();//以文件数组的形式，返回当前文件夹下的所有文件（不包含子文件及子文件夹）
		if(null == fs) 
			return;
		long minSize = Integer.MAX_VALUE;
		long maxSize = 0;
		File minFile = null;
		File maxFile = null;
		
		for (File file : fs) {
			if(file.isDirectory())
				continue;
			if(file.length() > maxSize){
				maxSize = file.length();
				maxFile = file;
			}
			if(file.length()!=0 && file.length()<minSize){
				minSize = file.length();
				minFile = file;
			}
		}
		
		System.out.printf("最大的文件是%s，其大小是%,d字节%n",maxFile.getAbsoluteFile(),maxFile.length());
		System.out.printf("最小的文件是%s，其大小是%,d字节%n",minFile.getAbsoluteFile(),minFile.length());
	}	
}
