package com.gtmap.io.test;

import java.io.File;
/**
 * �ļ�����
 * 	�ļ����ļ��ж�����File����
 * 	
 * @author Administrator
 *
 */
public class Test_IO_01_Create_A_File_Object {
	public static void main(String[] args) {
		/**
		 * ����һ���ļ�����
		 * 	ʹ�þ���·���������·������File����
		 */
		//ʹ�þ���·������һ���ļ�����
		File f1 = new File("d:/LoLFolder");
		System.out.println("f1�ľ���·����" + f1.getAbsolutePath());
		
		//ʹ�����·������һ���ļ�����
		File f2 = new File("LOL.exe");
		System.out.println("f2�ľ���·����" + f2.getAbsolutePath());
		
		//��f1��Ϊ��Ŀ¼�����ļ�����
		File f3 = new File(f1,"DNF.exe");
		System.out.println("f3�ľ���·����" + f3.getAbsolutePath());
	}
}
