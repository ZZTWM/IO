package com.gtmap.io.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * �ر�������finally�йر�
 * ���Ǳ�׼�Ĺر����ķ�ʽ
 * 1. ���Ȱ���������������try�����棬���������try���棬���������޷��ִ�finally.
 * 2. ��finally�ر�֮ǰ��Ҫ���жϸ������Ƿ�Ϊ��
 * 3. �رյ�ʱ����Ҫ��һ�ν���try catch����
 * ���Ǳ�׼���Ͻ��Ĺر����ķ�ʽ�����ǿ���ȥ�ܷ���������д����Ҫ�Ļ��߲��Դ����ʱ��
 * ������������������try�ķ�ʽ����Ϊ���鷳~
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
			System.out.println("�ļ������ڣ�");
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{
			//��finally��ر���
			if(null != fis)
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
		
	}
}
