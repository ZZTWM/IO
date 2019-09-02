package com.gtmap.io.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
/**
 * �ر����ķ�ʽ��
 * ʹ��try()�ķ�ʽ
 * ����������try()��,try,catch����finally������ʱ�򣬻��Զ��ر�
 * ���ֱ�д����ķ�ʽ���� try-with-resources�� ���Ǵ�JDK7��ʼ֧�ֵļ���
 * ���е�������ʵ����һ���ӿڽ��� AutoCloseable���κ���ʵ��������ӿڣ�
 * ��������try()�н���ʵ������ ������try, catch, finally������ʱ���Զ��رգ�
 * ���������Դ��
 * @author Administrator
 *
 */
public class Test_IO_10 {
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
