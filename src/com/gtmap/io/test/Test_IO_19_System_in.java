package com.gtmap.io.test;

import java.io.InputStream;

/**
 * System.in ���Դӿ���̨��������
 * ʹ��System.in.read��Ȼ���Զ�ȡ���ݣ����Ǻܲ�����
 * @author Administrator
 *
 */
public class Test_IO_19_System_in {
	public static void main(String[] args) {
		try(InputStream is = System.in;) {
			while(true){
                // ����a,Ȼ���ûس����Կ���
                // 97 13 10
                // 97��a��ASCII��
                // 13 10�ֱ��Ӧ�س�����
				int i = is.read();
				System.out.println(i);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}