package com.gtmap.io.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * ʲô������
 * 	ʲô����(Stream)��������һϵ�е�����
 * 	����ͬ�Ľ���֮�������ݽ�����ʱ��JAVA��ʹ������ʵ�֡�
 * 	����Դ�������ļ��������������ݿ⣬���������������ĳ���
 * 	�����ȡ�ļ������ݵ������У�վ�ڳ���ĽǶ��������ͽ���������
 * 	�������� InputStream
 * 	�������OutputStream
 * @author Administrator
 *
 */
public class Test_IO_05_FileOutputStream {
	public static void main(String[] args) throws IOException {
		/**
		 * �ļ������
		 */
		try {
			File f = new File("d:/lol.txt");
			//���������ļ���������
			FileOutputStream fos = new FileOutputStream(f);			
			// ͨ��������������Ϳ��԰����ݴ�Ӳ�̣���ȡ��Java�������������Ҳ���Ƕ�ȡ���ڴ���
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
