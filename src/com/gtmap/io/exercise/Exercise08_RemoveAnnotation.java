package com.gtmap.io.exercise;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * �Ƴ�ע��
 * ���һ�������������Ƴ�Java�ļ��е�ע��
 * public void removeComments(File javaFile)
 * ���磬�Ƴ���//��ͷ��ע����
 * File f = new File("d:/LOLFolder/LOL.exe");
 * System.out.println("��ǰ�ļ��ǣ�" +f);
 * //�ļ��Ƿ����
 * System.out.println("�ж��Ƿ���ڣ�"+f.exists());
 * //�Ƿ����ļ���
 * System.out.println("�ж��Ƿ����ļ��У�"+f.isDirectory());
 * ע�� ���ע���ں��棬�����Ƿ���ע�ͣ��ݲ��ô���
 * @author Administrator
 *
 */
public class Exercise08_RemoveAnnotation {
	//ע�⣺Ҫ��ͨ��BuffedReader ��ȡ�����ݺ󣬲��ܽ���Printwriter����Ϊ�����������ʱ�򣬻��Ŀ���ļ��������
    public static void removeComments(File javaFile) {
        StringBuffer sb = new StringBuffer();
        //��ȡ����
        try (FileReader fr = new FileReader(javaFile); BufferedReader br = new BufferedReader(fr);) {
            while (true) {
                String line = br.readLine();
                if (null == line)
                    break;
                //���������//��ͷ���ͱ�����StringBuffer��
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
            //д������
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
