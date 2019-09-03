package com.gtmap.io.test;

import java.io.InputStream;

/**
 * System.in 可以从控制台输入数据
 * 使用System.in.read虽然可以读取数据，但是很不方便
 * @author Administrator
 *
 */
public class Test_IO_19_System_in {
	public static void main(String[] args) {
		try(InputStream is = System.in;) {
			while(true){
                // 敲入a,然后敲回车可以看到
                // 97 13 10
                // 97是a的ASCII码
                // 13 10分别对应回车换行
				int i = is.read();
				System.out.println(i);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
