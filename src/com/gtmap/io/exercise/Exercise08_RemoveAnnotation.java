package com.gtmap.io.exercise;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 移除注释
 * 设计一个方法，用于移除Java文件中的注释
 * public void removeComments(File javaFile)
 * 比如，移出以//开头的注释行
 * File f = new File("d:/LOLFolder/LOL.exe");
 * System.out.println("当前文件是：" +f);
 * //文件是否存在
 * System.out.println("判断是否存在："+f.exists());
 * //是否是文件夹
 * System.out.println("判断是否是文件夹："+f.isDirectory());
 * 注： 如果注释在后面，或者是风格的注释，暂不用处理
 * @author Administrator
 *
 */
public class Exercise08_RemoveAnnotation {
	//注意：要在通过BuffedReader 读取完数据后，才能建立Printwriter，因为创建输出流的时候，会把目标文件内容清空
    public static void removeComments(File javaFile) {
        StringBuffer sb = new StringBuffer();
        //读取内容
        try (FileReader fr = new FileReader(javaFile); BufferedReader br = new BufferedReader(fr);) {
            while (true) {
                String line = br.readLine();
                if (null == line)
                    break;
                //如果不是以//开头，就保存在StringBuffer中
                if (!line.trim().startsWith("//"))
                    sb.append(line).append("\r\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
 
        try (
            FileWriter fw = new FileWriter(javaFile);
            PrintWriter pw = new PrintWriter(fw);
        ) {
            //写出内容
            pw.write(sb.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
 
    public static void main(String[] args) {
        File javaFile = new File("E:\\project\\j2se\\src\\character\\MyStringBuffer2.java");
        System.out.println(javaFile.exists());
        System.out.println(javaFile.length());
        removeComments(javaFile);
    }
}
