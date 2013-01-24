package com.cn.cnm;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class UFile {
    public static String getFileName() {
        StringBuffer sb = new StringBuffer();
        sb.append(UConst.filePath);
        sb.append(UConst.fileNameQianzhui);
        sb.append("_");
        SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmmss");
        sb.append(df.format(new Date()));
        sb.append(UConst.fileKuozhanming);
        return sb.toString();
    }
    
    public static void writeFile(String filePath, String fileInfo) {
        
        File file = new File(filePath);
        
        if (!file.exists()) {
            try {
                file.createNewFile();//�������ļ�
              } catch (IOException e) {
                e.printStackTrace();
              }
        }
        
        //����������
        FileOutputStream fos = null;
        try{
            //����������
            fos = new FileOutputStream(filePath);
            fos.write(fileInfo.getBytes());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                fos.close();
            } catch (Exception e) {
            }
        }
    }
}
