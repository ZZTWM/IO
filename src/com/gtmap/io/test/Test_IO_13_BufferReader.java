package com.gtmap.io.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 * ʹ�û�������ȡ���ݣ������ַ������� BufferedReader ����һ�ζ�ȡһ������
 * @author Administrator
 *
 */
public class Test_IO_13_BufferReader {
	public static void main(String[] args) {
		// ׼��lol.txt���е�������
		// gareen kill teemo
		// teemo revive after 1 minutes
		// teemo try to garen,but killed again
		File file = new File("d:/lol.txt");
		try(
		        // �����ļ��ַ���
		        // ���������뽨����һ�����ڵ����Ļ�����
				FileReader fr = new FileReader(file);
				BufferedReader br = new BufferedReader(fr);
			) 
		{
			while(true){
				//һ�ζ�һ��
				String line = br.readLine();
				if(null == line)
					break;
				System.out.println(line);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
