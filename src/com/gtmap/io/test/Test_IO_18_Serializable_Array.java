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
 * 序列化数组:
 *  准备一个长度是10，类型是Hero的数组，使用10个Hero对象初始化该数组
 *  然后把该数组序列化到一个文件heros.lol
 *  接着使用ObjectInputStream 读取该文件，并转换为Hero数组，验证该数组中的内容，是否和序列化之前一样
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
			System.out.println("查看中文件中反序列化出来的数组中的每一个元素:");
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
