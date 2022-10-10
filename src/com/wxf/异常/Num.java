package com.wxf.异常;

public class Num {

    public void numCheck(int num) throws NumException {
        if (num<1 || num>10){
//            throw new NumException();
            throw new NumException("输入的数字不正确");
        }else {
            System.out.println("输入的数字正确:");
        }
    }
}
