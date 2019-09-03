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
 * 序列化一个对象：
 * 创建一个Hero对象，设置其名称为garen。 
 * 把该对象序列化到一个文件garen.lol。
 * 然后再通过序列化把该文件转换为一个Hero对象
 * 注：把一个对象序列化有一个前提是：这个对象的类，必须实现了Serializable接口
 * @author Administrator
 *
 */
public class Test_IO_17_Serializable {
	public static void main(String[] args) {
        //创建一个Hero garen
        //要把Hero对象直接保存在文件上，务必让Hero类实现Serializable接口
		Hero h = new Hero();
		h.name = "gareen";
		h.hp = 616;
		File file = new File("d:/gareen.lol");
		try(
				//创建对象输出流
				FileOutputStream fos = new FileOutputStream(file);
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				//创建对象输入流
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
