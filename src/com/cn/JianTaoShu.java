package com.cn;

import com.cn.cnm.UFile;
import com.cn.cnm.Util;
import com.cn.system.CreateJianTaoShu;

public class JianTaoShu {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Util.outputInfo("-----------------------------���������� Start");
        String filename = UFile.getFileName();
        UFile.writeFile(filename, CreateJianTaoShu.create());
        Util.outputInfo("������:" + filename);
        Util.outputInfo("-----------------------------���������� End");
    }
    
    
}
