package com.gtmap.io.test;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 数据流
 * 直接进行字符串的读写:
 * 使用数据流的writeUTF()和readUTF() 可以进行数据的格式化顺序读写
 * 如本例，通过DataOutputStream 向文件顺序写出 布尔值，整数和字符串。 
 * 然后再通过DataInputStream 顺序读入这些数据。
 * 注： 要用DataInputStream 读取一个文件，这个文件必须是由DataOutputStream 写出的，
 * 否则会出现EOFException，
 * 因为DataOutputStream 在写出的时候会做一些特殊标记，只有DataInputStream 才能成功的读取。
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
			
            System.out.println("读取到布尔值:"+b);
            System.out.println("读取到整数:"+i);
            System.out.println("读取到字符串:"+str);
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
