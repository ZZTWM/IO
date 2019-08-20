package com.gtmap.io.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * �ֽ�����
 * 	InputStream�ֽ������� 
 * 	OutputStream�ֽ������ 
 * 	�������ֽڵ���ʽ��ȡ��д������
 *
 */
public class Test_IO_06_InputStream {
	public static void main(String[] args) throws IOException {
		/**
		 * ���ֽ�������ʽ��ȡ�ļ�����
		 * 	InputStream���ֽ���������ͬʱҲ�ǳ����ֻ࣬�ṩ�������������ṩ�����ľ���ʵ�֡�
		 * 	FileInputStream ��InputStream���࣬��FileInputStream Ϊ�������ļ���ȡ
		 */
		try {
			//׼���ļ�lol.txt���е�������AB����Ӧ��ASCII�ֱ���65 66
			File f = new File("d:/lol.txt");
			//���������ļ���������
			FileInputStream fis = new FileInputStream(f);
			//�����ֽ����飬�䳤�Ⱦ����ļ��ĳ���
			byte[] all = new byte[(int) f.length()];
			//���ֽ�������ʽ��ȡ�ļ���������
			fis.read(all);
			for (byte b : all) {
				System.out.println(b);
			}
			//ÿ��ʹ����������Ӧ�ý��йر�
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}
}
