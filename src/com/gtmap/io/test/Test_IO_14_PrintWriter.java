package com.gtmap.io.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * ʹ�û�����д������:
 * PrintWriter �����ַ�������� ����һ��д��һ������
 * @author Administrator
 *
 */
public class Test_IO_14_PrintWriter {
	public static void main(String[] args) {
		//���ļ�lol2.txt��д���������
		File file = new File("d:/lol2.txt");
		try(
				// �����ļ��ַ���
				FileWriter fw = new FileWriter(file);
				// ���������뽨����һ�����ڵ����Ļ�����
				PrintWriter pw = new PrintWriter(file);
			)
		{
			pw.println("garen kill teemo");
			pw.println("teemo revive after 1 minutes");
			pw.println("teemo try to garen, but killed again");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
}
