package com.gtmap.io.test;

import java.io.File;
import java.io.FileWriter;
/**
 * ʹ���ַ������ַ���д�뵽�ļ���
 * FileWriter ��Writer�����࣬��FileWriter Ϊ�����ַ���д�뵽�ļ�
 * @author Administrator
 *
 */
public class Test_IO_12_Char_InputStream02_FileWriter {
	public static void main(String[] args) {
		//׼���ļ�lol2.txt
		File file = new File("d:/lol2.txt");
		// ���������ļ���Writer
		try(FileWriter fw = new FileWriter(file)) {
			String data = "abcdefg1234567890";
			char[] cs = data.toCharArray();
			fw.write(cs);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
