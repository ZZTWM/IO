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
 * ���л�һ������
 * ����һ��Hero��������������Ϊgaren�� 
 * �Ѹö������л���һ���ļ�garen.lol��
 * Ȼ����ͨ�����л��Ѹ��ļ�ת��Ϊһ��Hero����
 * ע����һ���������л���һ��ǰ���ǣ����������࣬����ʵ����Serializable�ӿ�
 * @author Administrator
 *
 */
public class Test_IO_17_Serializable {
	public static void main(String[] args) {
        //����һ��Hero garen
        //Ҫ��Hero����ֱ�ӱ������ļ��ϣ������Hero��ʵ��Serializable�ӿ�
		Hero h = new Hero();
		h.name = "gareen";
		h.hp = 616;
		File file = new File("d:/gareen.lol");
		try(
				//�������������
				FileOutputStream fos = new FileOutputStream(file);
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				//��������������
				FileInputStream fis = new FileInputStream(file);
				ObjectInputStream ois = new ObjectInputStream(fis);
		) {
			oos.writeObject(h);
			Hero h2 = (Hero) ois.readObject();
			System.out.println(h2.name);
			System.out.println(h2.hp);
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
