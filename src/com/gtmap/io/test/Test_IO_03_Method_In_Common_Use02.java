package com.gtmap.io.test;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * �ļ�����
 * 	�ļ����ļ��ж�����File����
 * 	�ļ����÷���2��
 * @author Administrator
 *
 */
public class Test_IO_03_Method_In_Common_Use02 {
	public static void main(String[] args) throws IOException {
		File f = new File("d:/LOLFolder/skin/garen");
		//1�����ַ����������ʽ�����ص�ǰ�ļ����µ������ļ������������ļ������ļ��У�
		String[] str = f.list();
		System.out.println(str.length);
		
		//2�����ļ��������ʽ�����ص�ǰ�ļ����µ������ļ������������ļ������ļ��У�
		File[]fs= f.listFiles();
		
		//3�����ַ�����ʽ���ػ�ȡ�����ļ��еĸ��ļ��У���һ��Ŀ¼
		String str2 = f.getParent();
		System.out.println(str2);
		
		//4�����ļ���ʽ���ػ�ȡ�����ļ���
		f.getParentFile();
		
		//5�������ļ��У�������ļ���skin�����ڣ���������Ч
		f.mkdir();
		
		//6�������ļ��У�������ļ���skin�����ڣ��ͻᴴ�����ļ���
		f.mkdirs();
		
		//7������һ�����ļ�,������ļ���skin�����ڣ��ͻ��׳��쳣
		f.createNewFile();
		
		//8�����Դ���һ�����ļ�֮ǰ��ͨ�����ᴴ����Ŀ¼
		f.getParentFile().mkdirs();
		
		//9���г����е��̷�c: d: e: �ȵ�
		f.listRoots();
		
		//10��ɾ���ļ�
		f.delete();
		
		//11��JVM������ʱ��ɾ���ļ�����������ʱ�ļ���ɾ��
		f.deleteOnExit();
	}
}
