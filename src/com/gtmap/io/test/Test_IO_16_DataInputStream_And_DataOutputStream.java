package com.gtmap.io.test;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * ������
 * ֱ�ӽ����ַ����Ķ�д:
 * ʹ����������writeUTF()��readUTF() ���Խ������ݵĸ�ʽ��˳���д
 * �籾����ͨ��DataOutputStream ���ļ�˳��д�� ����ֵ���������ַ����� 
 * Ȼ����ͨ��DataInputStream ˳�������Щ���ݡ�
 * ע�� Ҫ��DataInputStream ��ȡһ���ļ�������ļ���������DataOutputStream д���ģ�
 * ��������EOFException��
 * ��ΪDataOutputStream ��д����ʱ�����һЩ�����ǣ�ֻ��DataInputStream ���ܳɹ��Ķ�ȡ��
 * @author Administrator
 *
 */
public class Test_IO_16_DataInputStream_And_DataOutputStream {
	public static void main(String[] args) {
		write();
		read();
	}

	private static void read() {
		File file = new File("d:/lol.txt");
		try(
				FileInputStream fis = new FileInputStream(file);
				DataInputStream dis = new DataInputStream(fis);
		) {
			boolean b = dis.readBoolean();
			int i = dis.readInt();
			String str = dis.readUTF();
			
            System.out.println("��ȡ������ֵ:"+b);
            System.out.println("��ȡ������:"+i);
            System.out.println("��ȡ���ַ���:"+str);
		} catch (FileNotFoundException e) {
		
			e.printStackTrace();
		} catch (IOException e1) {
			
			e1.printStackTrace();
		}
		
	}

	private static void write() {
		File file = new File("d:/lol.txt");
		try(
				FileOutputStream fos = new FileOutputStream(file);
				DataOutputStream dos = new DataOutputStream(fos);
		) {
			dos.writeBoolean(true);
			dos.writeInt(300);
			dos.writeUTF("123 this is green");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
	}
}
