package com.gtmap.io.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 关闭流的方式：在try中关闭
 * @author Administrator
 *
 */
public class Test_IO_08 {
	public static void main(String[] args) {
		
		try {
			File file = new File("d:/dnf.txt");
			FileInputStream fis = new FileInputStream(file);
			byte[] all = new byte[(int) file.length()];
			fis.read(all);
			for (byte b : all) {
				System.out.println(b);
			}
			fis.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
