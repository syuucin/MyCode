package com.cn.system;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import com.cn.cnm.UConst;
import com.cn.cnm.Util;

public class CreateJianTaoShu {
    static {
        //TODO Demo版本，const定义内容，扩展读取外部文件获取内容。
        UConst.jianTaoShuInfo.add("我错了1");
        UConst.jianTaoShuInfo.add("我错了2");
        UConst.jianTaoShuInfo.add("我错了3");
        UConst.jianTaoShuInfo.add("我错了4");
        UConst.jianTaoShuInfo.add("我错了5");
        UConst.jianTaoShuInfo.add("我错了6");
        UConst.jianTaoShuInfo.add("我错了7");
        UConst.jianTaoShuInfo.add("我错了8");
        UConst.jianTaoShuInfo.add("我错了9");
        UConst.jianTaoShuInfo.add("我错了10");
        UConst.jianTaoShuInfo.add("我错了11");
        UConst.jianTaoShuInfo.add("我错了12");
        UConst.jianTaoShuInfo.add("我错了13");
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
