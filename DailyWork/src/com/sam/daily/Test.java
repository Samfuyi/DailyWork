/*
 * Copyright (C), 2015-2017, 上海睿民互联网科技有限公司
 * Package com.sam.daily 
 * FileName: Test.java
 * Author:   Administrator
 * Date:     2017年3月22日 下午1:45:34
 * Description: //模块目的、功能描述      
 * History: //修改记录
 *===============================================================================================
 *   author：          time：                             version：           desc：
 *   Administrator           2017年3月22日下午1:45:34                     1.0                  
 *===============================================================================================
 */
package com.sam.daily;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * 名称：〈一句话功能简述〉<br>
 * 功能：〈功能详细描述〉<br>
 * 方法：〈方法简述 - 方法描述〉<br>
 * 版本：1.0 <br>
 * 日期：2017年3月22日 <br>
 * 作者：Administrator <br>
 * 说明：<br>
 */
public class Test {
    private static final int _1MB = 1024 * 1024;
    public int k=4;

    public static void main(String[] args) {
//        List<Integer> list = new ArrayList<>();
//        for (int i = 0; i < 10000; i++) {
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                // TODO Auto-generated catch block
//                e.printStackTrace();
//            }
//            list.add(_1MB);
//            System.out.println(list.size());
//            add(1, 2);
//        }
//        Integer a=1;
//        Integer b=2;
//        Integer c=3;
//        Integer d=3;
//        Integer e=-128;
//        Integer f=-128;
//        Long g=3L;
//        System.out.println(c==d);
//        System.out.println(e==f);
//        System.out.println(c==(a+b));
//        System.out.println(c.equals(a+b));
//        System.out.println(g==(a+b));
//        System.out.println(g.equals(a+b));
        
        //System.out.println(System.getProperty("user.dir"));
        System.out.println(getTimeMillisSequence());
    }
    
    public static String getTimeMillisSequence(){
        long nanoTime = System.nanoTime();
        String preFix="";
        if (nanoTime<0){
            preFix="A";//负数补位A保证负数排在正数Z前面,解决正负临界值(如A9223372036854775807至Z0000000000000000000)问题。
            nanoTime = nanoTime+Long.MAX_VALUE+1;
        }else{
            preFix="Z";
        }
        String nanoTimeStr = String.valueOf(nanoTime);
         
        int difBit=String.valueOf(Long.MAX_VALUE).length()-nanoTimeStr.length();
        for (int i=0;i<difBit;i++){
            preFix = preFix+"0";
        }
        nanoTimeStr = preFix+nanoTimeStr;
        SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMddHHmmssSSS"); //24小时制
        String timeMillisSequence=sdf.format(System.currentTimeMillis())+"-"+nanoTimeStr; 
         
        return timeMillisSequence;      
    }

    private int add(int a, int b) {
        return (a + b);
    }

}
