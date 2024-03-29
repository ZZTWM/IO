package com.gtmap.io.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
/**
 * 关闭流的方式：
 * 使用try()的方式
 * 把流定义在try()里,try,catch或者finally结束的时候，会自动关闭
 * 这种编写代码的方式叫做 try-with-resources， 这是从JDK7开始支持的技术
 * 所有的流，都实现了一个接口叫做 AutoCloseable，任何类实现了这个接口，
 * 都可以在try()中进行实例化。 并且在try, catch, finally结束的时候自动关闭，
 * 回收相关资源。
 * @author Administrator
 *
 */
public class Test_IO_10_Close_IO_Method03_Within_try_ {
	public static void main(String[] args) {
		File file = new File("d:/dnf.txt");
		try(FileInputStream fis = new FileInputStream(file);) {
			byte[] all = new byte[(int) file.length()];
			fis.read(all);
			for (byte b : all) {
				System.out.println(b);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
	}
}
