package com.gtmap.io.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
/**
 * �е�ʱ����Ҫ����������д�뵽Ӳ�̣������ǵȻ������˲�д��ȥ�� ��ʱ�����Ҫ�õ�flush
 * @author Administrator
 *
 */
public class Test_IO_15_flush {
	public static void main(String[] args) {
		// ���ļ�lol2.txt��д���������
		File file = new File("d:/lol2.txt");
		//�����ļ��ַ���
		//���������뽨����һ�����ڵ����Ļ�����
		try(FileWriter fw = new FileWriter(file);PrintWriter pw = new PrintWriter(fw)){
			pw.println("garen kill teemo");
			pw.flush();
			pw.println("teemo revive after 1 minutes");
			pw.flush();
			pw.println("teemo try to garen, but killed again");
			pw.flush();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
}
