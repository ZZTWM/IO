package com.gtmap.io.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * �ر����ķ�ʽ����try�йر�
 * @author Administrator
 *
 */
public class Test_IO_08_Close_IO_Method01_Within_Try {
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
