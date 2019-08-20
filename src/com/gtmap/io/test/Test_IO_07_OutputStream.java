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
public class Test_IO_07_OutputStream {
	public static void main(String[] args) throws IOException {
		/**
		 * ���ֽ�������ʽ���ļ�д������
		 * 	OutputStream���ֽ��������ͬʱҲ�ǳ����ֻ࣬�ṩ�������������ṩ�����ľ���ʵ�֡�
		 * 	FileOutputStream ��OutputStream���࣬��FileOutputStream Ϊ�����ļ�д������
		 * 	ע: ����ļ�d:/lol2.txt�����ڣ�д���������Զ��������ļ��� 
		 * 	����������ļ� d:/xyz/lol2.txt����Ŀ¼xyz�ֲ����ڣ����׳��쳣
		 */
		try {
			// ׼���ļ�dnf.txt���е������ǿյ�
			File f = new File("d:/dnf.txt");
			//׼��������2���ֽ����飬��88,89��ʼ�������Ӧ���ַ��ֱ���X,Y
			byte data[] = {88,89};
			//���������ļ���������
			FileOutputStream fos = new FileOutputStream(f);
			//������д�뵽������
			fos.write(data);
			//�ر�������
			fos.close();
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		
	}
}
