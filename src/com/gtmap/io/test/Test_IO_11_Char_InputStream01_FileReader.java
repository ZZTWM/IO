package com.gtmap.io.test;

import java.io.File;
import java.io.FileReader;

public class Test_IO_11_Char_InputStream01_FileReader {
	public static void main(String[] args) {
		//׼���ļ�dnf.txt���е�������XY
		File file = new File("d:/dnf.txt");
		//���������ļ���Reader
		try(FileReader fr = new FileReader(file)) {
			//�����ַ����飬�䳤�Ⱦ����ļ�����
			char[] all = new char[(int) file.length()];
			//���ַ�������ʽ��ȡ�ļ���������
			fr.read(all);
			for (char c : all) {
				//��ӡ������ X Y
				System.out.println(c);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}
