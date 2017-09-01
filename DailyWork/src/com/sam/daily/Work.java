/*
 * Copyright (C), 2015-2017, 上海睿民互联网科技有限公司
 * Package com.sam.daily 
 * FileName: Work.java
 * Author:   Administrator
 * Date:     2017年3月20日 上午9:00:55
 * Description: //模块目的、功能描述      
 * History: //修改记录
 *===============================================================================================
 *   author：          time：                             version：           desc：
 *   Administrator           2017年3月20日上午9:00:55                     1.0                  
 *===============================================================================================
 */
/**
 * 
 */
/**
 * 
 */
package com.sam.daily;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 名称：〈一句话功能简述〉<br>
 * 功能：〈功能详细描述〉<br>
 * 方法：〈方法简述 - 方法描述〉<br>
 * 版本：1.0 <br>
 * 日期：2017年3月20日 <br>
 * 作者：Sam <br>
 * 说明：<br>
 */
public class Work {
    private static String dirName;
    private static String workContent = "傅一磊\r\n" +

    "今天（" + getDate("-") + "）工作内容\r\n" +

    "1、协助手机银行测试新加的三个交易的功能\r\n" +

    "2、查出手机银行用的测试借记卡没法发同转账类交易\r\n" +

    "明天（" + getDate("-") + "）工作计划\r\n" +

    "1、协助手机银行测试新加的三个交易的功能哈哈啦";

    public static void main(String[] args) {
        if (createFolder()) {
            try {
                writeToFile();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

    private static String getDate(String symbol) {
        SimpleDateFormat df = new SimpleDateFormat("yyyy" + symbol + "M" + symbol + "dd");
        System.out.println("hahahha");
        return df.format(new Date());
    }

    private static boolean createFolder() {
        dirName = getDate(".");
        File dir = new File("D:\\Work\\每日工作\\2017\\" + dirName);
        if (dir.exists()) {
            System.out.println("创建目录失败，目标目录已存在！");
            return false;
        }
        if (dir.mkdirs()) {
            System.out.println("创建目录成功！" + dirName);
            return true;
        } else {
            System.out.println("创建目录失败！");
            return false;
        }
    }

    private static void writeToFile() throws IOException {
        OutputStreamWriter ow = null;
        ow = new OutputStreamWriter(new FileOutputStream(new File("D:\\Work\\每日工作\\2017\\" + dirName + "\\工作日志.txt")),
                "UTF-8");
        ow.write(workContent);
        ow.close();
    }

}
