package com.gtmap.io.exercise;

import java.io.File;
import java.io.FileOutputStream;
/**
 * д�����ݵ��ļ���
 * 	���ֽ�������ʽ���ļ�д������ �е����ӣ���lol2.txt�����ڵ�ʱ���ǻ��Զ�����lol2.txt�ļ��ġ�
 * 	���ǣ������д�����ݵ�d:/xyz/lol2.txt����Ŀ¼xyz�ֲ����ڵĻ����ͻ��׳��쳣��
 * 	��ô��ô�Զ�����xyzĿ¼��
 * 	����Ƕ��Ŀ¼ d:/xyz/abc/def/lol2.txt �أ�
 * @author Administrator
 *
 */
public class Exercise03_WriteDateToFile {
	public static void main(String[] args) {
		
		try {
			//��ΪĬ������£��ļ�ϵͳ�в����� d:\xyz\abc\def�����������ʧ��
			File f = new File("d:/xyz/abc/def/wow.txt");
			//���Ȼ�ȡ�ļ����ڵ�Ŀ¼
			File dir = f.getParentFile();
			//System.out.println(dir);
			if(!dir.exists()){
				//dir.mkdir(); //ʹ��mkdir���׳��쳣����Ϊ��Ŀ¼�ĸ�Ŀ¼Ҳ������
				dir.mkdirs();//ʹ��mkdirs���Ѳ����ڵ�Ŀ¼��������
			}
			
			byte data[] = {88,89};
			FileOutputStream fos = new FileOutputStream(f);
			fos.write(data);
			fos.close();
			
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		
	}
}
