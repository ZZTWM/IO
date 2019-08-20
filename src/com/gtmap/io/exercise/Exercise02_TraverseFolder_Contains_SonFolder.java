package com.gtmap.io.exercise;

import java.io.File;
/**
 * ����C��windows�ļ������ļ������ұ������ļ��У��������ļ�����С���ļ����������С
 * 	һ��˵������ϵͳ���ᰲװ��C�̣����Ի���һ�� C:\WINDOWSĿ¼��
 * 	�������Ŀ¼�����е��ļ�(��Ҫ������Ŀ¼)
 * 	�ҳ���Щ�ļ�����ĺ���С(��0)���Ǹ��ļ�����ӡ�����ǵ��ļ���
 * 	ע: ��С���ļ�������0����
 */
public class Exercise02_TraverseFolder_Contains_SonFolder {
	static long minSize = Integer.MAX_VALUE;
	static long maxSize = 0;
	static File minFile = null;
	static File maxFile = null;
	
	public static void main(String[] args) {
		File f = new File("c:\\windows\\AppCompat");
		listFiles(f);
		System.out.printf("�����ļ���%s�����С��%,d�ֽ�%n",maxFile.getAbsoluteFile(),maxFile.length());
        System.out.printf("��С���ļ���%s�����С��%,d�ֽ�%n",minFile.getAbsoluteFile(),minFile.length());
	}
	
	public static void listFiles(File file){
		if(file.isFile()){
			if(file.length() > maxSize){
				maxSize = file.length();
				maxFile = file;
			}
			if(file.length() != 0 && file.length() < minSize){
				minSize = file.length();
				minFile = file;
			}
			return;
		}
		
		if(file.isDirectory()){
			File[] fs = file.listFiles();
			if(null != fs)
				for (File f : fs) {
					listFiles(f);
				}
		}
		
	}
	
}
