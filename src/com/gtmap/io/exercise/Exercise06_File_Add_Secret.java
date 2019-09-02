package com.gtmap.io.exercise;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
/**
 * �ļ�����
 * ׼��һ���ı��ļ�(�Ƕ�����)�����а���ASCII����ַ��������ַ���
 * ���һ������
 * public static void encodeFile(File encodingFile, File encodedFile);
 * ����������а�encodingFile�����ݽ��м��ܣ�Ȼ�󱣴浽encodedFile�ļ��С�
 * �����㷨�� 
 * ���֣�
 * �������9�����֣���ԭ���Ļ����ϼ�1������5���6, 3���4
 * �����9�����֣����0
 * ��ĸ�ַ���
 * ����Ƿ�z�ַ��������ƶ�һ��������d���e, G���H
 * �����z��z->a, Z-A��
 * �ַ���Ҫ������Сд
 * ����ĸ�ַ�
 * ����',&^ �������䣬����Ҳ��������
 * ���飺 ʹ����ǰѧϰ����ϰ���е�ĳ��Java�ļ�������ѭ����ϰ�����кܶ���ַ�������
 * @author Administrator
 *
 */
public class Exercise06_File_Add_Secret {
    /**
    *
    * @param encodingFile
    *            �����ܵ��ļ�
    * @param encodedFile
    *            ���ܺ󱣴��λ��
    */
   public static void encodeFile(File encodingFile, File encodedFile) {

       try (FileReader fr = new FileReader(encodingFile); FileWriter fw = new FileWriter(encodedFile)) {
           // ��ȡԴ�ļ�
           char[] fileContent = new char[(int) encodingFile.length()];
           fr.read(fileContent);
           System.out.println("����ǰ�����ݣ�");
           System.out.println(new String(fileContent));

           // ���м���
           encode(fileContent);
           // �Ѽ��ܺ�����ݱ��浽Ŀ���ļ�
           System.out.println("���ܺ�����ݣ�");
           System.out.println(new String(fileContent));

           fw.write(fileContent);
       } catch (IOException e) {
           // TODO Auto-generated catch block
           e.printStackTrace();
       }
   }

   private static void encode(char[] fileContent) {
       for (int i = 0; i < fileContent.length; i++) {
           char c = fileContent[i];
           if (isLetterOrDigit(c)) {
               switch (c) {
               case '9':
                   c = '0';
                   break;
               case 'z':
                   c = 'a';
                   break;
               case 'Z':
                   c = 'A';
                   break;
               default:
                   c++;
                   break;
               }
           }
           fileContent[i] = c;
       }
   }

   public static boolean isLetterOrDigit(char c) {
       // ��ʹ��Character���isLetterOrDigit��������Ϊ������Ҳ�ᱻ�ж�Ϊ��ĸ
       String letterOrDigital = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
       return -1 == letterOrDigital.indexOf(c) ? false : true;
   }

   public static void main(String[] args) {
       File encodingFile = new File("E:/project/j2se/src/Test1.txt");
       File encodedFile = new File("E:/project/j2se/src/Test2.txt");
       encodeFile(encodingFile, encodedFile);
   }	
}