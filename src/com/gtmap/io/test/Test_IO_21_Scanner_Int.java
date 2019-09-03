package com.gtmap.io.test;

import java.util.Scanner;

/**
 * Scanner从控制台读取整数
 * @author Administrator
 *
 */
public class Test_IO_21_Scanner_Int {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		System.out.println("第一个整数：" + a);
		int b = scan.nextInt();
		System.out.println("第二个整数：" + b);
	}
}
