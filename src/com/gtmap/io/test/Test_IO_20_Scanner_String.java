package com.gtmap.io.test;

import java.util.Scanner;

/**
 *  Scanner读取字符串
 * 	使用System.in.read虽然可以读取数据，但是很不方便
 * 	使用Scanner就可以逐行读取了
 * @author Administrator
 *
 */
public class Test_IO_20_Scanner_String {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(true){
			String line = scan.nextLine();
			System.out.println(line);
		}
	}
}
