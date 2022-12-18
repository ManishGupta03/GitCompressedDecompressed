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
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/**
 *
 * @author ADMIN
 */
public class Decompress {
    public static void decompressFunction(File file) throws FileNotFoundException, IOException{
        String fileDirectory = file.getParent();
        System.out.println(fileDirectory);
        FileInputStream fis = new FileInputStream(file);
        GZIPInputStream gzipOS = new GZIPInputStream( fis);
        FileOutputStream fos = new FileOutputStream(fileDirectory+"/DecompressedFile.txt");
        
        byte[] buffer = new byte[1024];
        int len;
        while((len= gzipIS.read(buffer))!=-1){
            fos.write(buffer,0,len);
        }
        gzipIS.close();
        fis.close();
        fos.close();
    }
    public static void main(String[] args) throws FileNotFoundException, IOException{
      File path = new File("D:\\desktop\\important files\\acciojob\\CompressededFile.gz");
       decompressFunction(path);
    }
  }
