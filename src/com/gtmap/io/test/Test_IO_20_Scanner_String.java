package com.gtmap.io.test;

import java.util.Scanner;

/**
 *  Scanner��ȡ�ַ���
 * 	ʹ��System.in.read��Ȼ���Զ�ȡ���ݣ����Ǻܲ�����
 * 	ʹ��Scanner�Ϳ������ж�ȡ��
 * @author Administrator
 *
 */
public class Test_IO_20_Scanner_String {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true){
			String line = scan.nextLine();
			System.out.println(line);
		}
	}
}
