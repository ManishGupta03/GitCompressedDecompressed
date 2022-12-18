/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CODEFILES;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;

/**
 *
 * @author ADMIN
 */
public class Compress {
    public static void compressFunction(File file) throws FileNotFoundException, IOException{
        String fileDirectory = file.getParent();// getting the parent address
        System.out.println(fileDirectory);
        FileInputStream fis = new FileInputStream(file);//creating object for reading from the file in byte format
        FileOutputStream fos = new FileOutputStream(fileDirectory+ "\\CompressededFile.gz");//giving output file of the directory
        GZIPOutputStream gzipOS = new GZIPOutputStream( fos);//converting input file into zip format
        byte[] buffer = new byte[1024];
        int len;
        while((len=fis.read(buffer))!=-1){
            gzipOS.write(buffer,0,len);
        }
        gzipOS.close();
        fos.close();
        fis.close();
    }
    public static void main(String[] args) throws IOException{
        File path = new File("D:\\desktop\\important files\\acciojob\\Project1.test.txt");
        compressFunction(path);
    }
  }
