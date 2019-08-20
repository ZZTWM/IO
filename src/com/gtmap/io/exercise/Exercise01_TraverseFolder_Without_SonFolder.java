package com.gtmap.io.exercise;

import java.io.File;
/**
 * ����C��windows�ļ������ļ������ñ������ļ��У��������ļ�����С���ļ����������С
 * һ��˵������ϵͳ���ᰲװ��C�̣����Ի���һ�� C:\WINDOWSĿ¼��
 * 	�������Ŀ¼�����е��ļ�(���ñ�����Ŀ¼)
 * 	�ҳ���Щ�ļ�����ĺ���С(��0)���Ǹ��ļ�����ӡ�����ǵ��ļ���
 * 	ע: ��С���ļ�������0����
 * @author Administrator
 *
 */
public class Exercise01_TraverseFolder_Without_SonFolder {
	public static void main(String[] args) {
		File f = new File("c:\\windows");
		File[] fs = f.listFiles();//���ļ��������ʽ�����ص�ǰ�ļ����µ������ļ������������ļ������ļ��У�
		if(null == fs) 
			return;
		long minSize = Integer.MAX_VALUE;
		long maxSize = 0;
		File minFile = null;
		File maxFile = null;
		
		for (File file : fs) {
			if(file.isDirectory())
				continue;
			if(file.length() > maxSize){
				maxSize = file.length();
				maxFile = file;
			}
			if(file.length()!=0 && file.length()<minSize){
				minSize = file.length();
				minFile = file;
			}
		}
		
		System.out.printf("�����ļ���%s�����С��%,d�ֽ�%n",maxFile.getAbsoluteFile(),maxFile.length());
		System.out.printf("��С���ļ���%s�����С��%,d�ֽ�%n",minFile.getAbsoluteFile(),minFile.length());
	}	
}
