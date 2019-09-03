package com.gtmap.io.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.charactor.Hero;

/**
 * ���л�����:
 *  ׼��һ��������10��������Hero�����飬ʹ��10��Hero�����ʼ��������
 *  Ȼ��Ѹ��������л���һ���ļ�heros.lol
 *  ����ʹ��ObjectInputStream ��ȡ���ļ�����ת��ΪHero���飬��֤�������е����ݣ��Ƿ�����л�֮ǰһ��
 * @author Administrator
 *
 */
public class Test_IO_18_Serializable_Array {
	public static void main(String[] args) {
		Hero hs[] = new Hero[10];
		for (int i = 0; i < hs.length; i++) {
			hs[i] = new Hero("hero:" + i);
		}
		File file = new File("d:/heros.lol");
		
		try(
				FileOutputStream fos = new FileOutputStream(file);
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				FileInputStream fis = new FileInputStream(file);
				ObjectInputStream ois = new ObjectInputStream(fis);
		) {
			oos.writeObject(hs);
			Hero[] hs2 = (Hero[]) ois.readObject();
			System.out.println("�鿴���ļ��з����л������������е�ÿһ��Ԫ��:");
			for (Hero hero : hs2) {
				System.out.println(hero.name);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
 	}
}
