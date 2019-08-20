package com.gtmap.io.exercise;

import java.io.File;
/**
 * 遍历C盘windows文件夹下文件，并且遍历子文件夹，找最大的文件和最小的文件，并输出大小
 * 	一般说来操作系统都会安装在C盘，所以会有一个 C:\WINDOWS目录。
 * 	遍历这个目录下所有的文件(需要遍历子目录)
 * 	找出这些文件里，最大的和最小(非0)的那个文件，打印出他们的文件名
 * 	注: 最小的文件不能是0长度
 */
public class Exercise02_TraverseFolder_Contains_SonFolder {
	static long minSize = Integer.MAX_VALUE;
	static long maxSize = 0;
	static File minFile = null;
	static File maxFile = null;
	
	public static void main(String[] args) {
		File f = new File("c:\\windows\\AppCompat");
		listFiles(f);
		System.out.printf("最大的文件是%s，其大小是%,d字节%n",maxFile.getAbsoluteFile(),maxFile.length());
        System.out.printf("最小的文件是%s，其大小是%,d字节%n",minFile.getAbsoluteFile(),minFile.length());
	}
	
	public static void listFiles(File file){
		if(file.isFile()){
			if(file.length() > maxSize){
				maxSize = file.length();
				maxFile = file;
			}
			if(file.length() != 0 && file.length() < minSize){
				minSize = file.length();
				minFile = file;
			}
			return;
		}
		
		if(file.isDirectory()){
			File[] fs = file.listFiles();
			if(null != fs)
				for (File f : fs) {
					listFiles(f);
				}
		}
		
	}
	
}
