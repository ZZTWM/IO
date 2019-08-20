package com.gtmap.io.test;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * �ļ�����
 * 	�ļ����ļ��ж�����File����
 * 	�ļ����÷���1��
 * @author Administrator
 *
 */
public class Test_IO_02_Method_In_Common_Use01 {
	public static void main(String[] args) {
		/**
		 * ע��1�� ��Ҫ��D:\LOLFolderȷʵ����һ��LOL.exe,�ſ��Կ�����Ӧ���ļ����ȡ��޸�ʱ�����Ϣ
		 * ע��2�� renameTo�������ڶ������ļ����ƽ����޸ģ����ǲ������޸�File�����name���ԡ�
		 */
		File f = new File("d:/LOLFolder/LOL.exe");
		System.out.println("��ǰ�ļ��ǣ�" + f);
		
		//1���ļ��Ƿ����
		System.out.println("�ж��ļ��Ƿ���ڣ�" + f.exists());
		
		//2���Ƿ����ļ���
		System.out.println("�ж��Ƿ����ļ��У�" + f.isDirectory());
		
		//3���Ƿ����ļ������ļ��У�
		System.out.println("�ж��Ƿ����ļ���" + f.isFile());
		
		//4���ļ�����
		System.out.println("�ļ����ȣ�" + f.length());
		
		//5���ļ�����޸�ʱ��
		long time1 = f.lastModified();
		Date date = new Date(time1);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
		String strDate = sdf.format(date);
		System.out.println("��ȡ�ļ�����޸�ʱ�䣺" + strDate);
		
		//6�������ļ��޸��޸�ʱ��Ϊ 1970.1.1 08:00:00
		f.setLastModified(0);
		long time2 = f.lastModified();
		Date date2 = new Date(time2);
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
		String strDate2 = sdf2.format(date2);
		System.out.println("�޸ĺ���ļ�ʱ��Ϊ��" + strDate2);
		
		//7���ļ�������
		File f2 = new File("d:/LOLFolder/DOTA.exe");
		f.renameTo(f2);
		System.out.println("��LOL.exe��������DOTA.exe");
		
		System.out.println("ע�⣺ ��Ҫ��D:\\LOLFolderȷʵ����һ��LOL.exe,\r\n�ſ��Կ�����Ӧ���ļ����ȡ��޸�ʱ�����Ϣ");
		
	}
}
