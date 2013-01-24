package com.cn.cnm;


public class Util {
    public static final String HuiChe = "\r\n";
    public enum AppendBlank {FIRST, LAST, TWO_IN_FIRST}
    public static String appendBlank(String info, int lenght, AppendBlank appendBlank) {
        StringBuilder sb = new StringBuilder(info);
        switch (appendBlank) {
        case FIRST:
            while (sb.length() <= lenght) {
                sb = (new StringBuilder(" ")).append(sb);
            }
            break;
        case LAST:
            while (sb.length() <= lenght) {
                sb.append(" ");
            }
            break;
        case TWO_IN_FIRST:
            sb = (new StringBuilder(" ")).append(sb);
            sb = (new StringBuilder(" ")).append(sb);
            sb = (new StringBuilder(" ")).append(sb);
            sb = (new StringBuilder(" ")).append(sb);
            break;
        default:
            break;
        }
        return sb.toString();
    }
    
    public static void outputInfo(String info) {
        System.out.println(info);
    }
}
