package com.wxf.递归;

import java.io.File;

/**
 * @Author Ssanhu
 * @Date 2022-10-15
 */
public class DirectoryDiguiDemo {
    public static void main(String[] args) {
        // 创建File对象
        File file = new File("D:\\Eage下载");
        getAllFilePaths(file);
    }

    public static void getAllFilePaths(File file) {
        // 获取给定的File目录下所有的文件或者目录的File数组
        File[] files = file.listFiles();
        // 遍历File数组，得到每个File对象
        if (files != null){
            for (File f : files) {
                if (f.isDirectory()){
                    getAllFilePaths(f);
                }else {
                    System.out.println(f.getAbsoluteFile());
                }
            }
        }

    }
}
