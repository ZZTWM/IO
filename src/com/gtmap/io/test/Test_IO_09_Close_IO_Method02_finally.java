package com.gtmap.io.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 关闭流：在finally中关闭
 * 这是标准的关闭流的方式
 * 1. 首先把流的引用声明在try的外面，如果声明在try里面，其作用域无法抵达finally.
 * 2. 在finally关闭之前，要先判断该引用是否为空
 * 3. 关闭的时候，需要再一次进行try catch处理
 * 这是标准的严谨的关闭流的方式，但是看上去很繁琐，所以写不重要的或者测试代码的时候，
 * 都会采用上面的有隐患try的方式，因为不麻烦~
 * @author Administrator
 *
 */
public class Test_IO_09_Close_IO_Method02_finally {
	public static void main(String[] args) {
		File file = new File("d:/dnf.txt");
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(file);
			byte[] all = new byte[(int) file.length()];
			fis.read(all);
			for (byte b : all) {
				System.out.println(b);
			}
		} catch (FileNotFoundException e) {
			System.out.println("文件不存在！");
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			//在finally里关闭流
			if(null != fis)
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
		
	}
}
