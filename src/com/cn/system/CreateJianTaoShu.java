package com.cn.system;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import com.cn.cnm.UConst;
import com.cn.cnm.Util;

public class CreateJianTaoShu {
    static {
        //TODO Demo�汾��const�������ݣ���չ��ȡ�ⲿ�ļ���ȡ���ݡ�
        UConst.jianTaoShuInfo.add("�Ҵ���1");
        UConst.jianTaoShuInfo.add("�Ҵ���2");
        UConst.jianTaoShuInfo.add("�Ҵ���3");
        UConst.jianTaoShuInfo.add("�Ҵ���4");
        UConst.jianTaoShuInfo.add("�Ҵ���5");
        UConst.jianTaoShuInfo.add("�Ҵ���6");
        UConst.jianTaoShuInfo.add("�Ҵ���7");
        UConst.jianTaoShuInfo.add("�Ҵ���8");
        UConst.jianTaoShuInfo.add("�Ҵ���9");
        UConst.jianTaoShuInfo.add("�Ҵ���10");
        UConst.jianTaoShuInfo.add("�Ҵ���11");
        UConst.jianTaoShuInfo.add("�Ҵ���12");
        UConst.jianTaoShuInfo.add("�Ҵ���13");
    }
    public static String create() {
        StringBuilder sb = new StringBuilder();
        sb.append(createHead("Liu Fangfang"));
        sb.append(createJianTaoShuInfo(10));
        sb.append(createQianMingDang("Zhou Xin"));
        return sb.toString();
    }
    private static String createJianTaoShuInfo (int count) {
        if (count > UConst.jianTaoShuInfo.size())
            count = UConst.jianTaoShuInfo.size();
        StringBuilder sb = new StringBuilder();
        sb.append(Util.HuiChe);
        for (int i = 0; i < count; i++) {
            Random rnd = new Random();
            int index = rnd.nextInt(count);
            sb.append(Util.HuiChe);
            sb.append(Util.appendBlank(UConst.jianTaoShuInfo.get(index), UConst.lieCount, Util.AppendBlank.TWO_IN_FIRST));
            sb.append(Util.HuiChe);
        }
        return sb.toString();
    }
    private static String createHead(String name) {
        StringBuilder sb = new StringBuilder();
        sb.append(name);
        sb.append(":");
        return sb.toString();
    }
    
    private static String createQianMingDang(String name) {
        StringBuilder sb = new StringBuilder();
        sb.append(Util.appendBlank(name, UConst.lieCount, Util.AppendBlank.FIRST));
        sb.append(Util.HuiChe);
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        sb.append(Util.appendBlank(df.format(new Date()), UConst.lieCount, Util.AppendBlank.FIRST));
        return sb.toString();
    }
}
