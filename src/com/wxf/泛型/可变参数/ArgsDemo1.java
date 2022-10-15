package com.wxf.泛型.可变参数;

public class ArgsDemo1 {
    public static void main(String[] args) {
        System.out.println(sum(1,2,3,4,5,6,6,7));
        System.out.println(sum(1,3,4,5,6,6,7));
        System.out.println(sum(1,4,5,6,6,7));
    }

    public static int sum(int a ,int... b){ //int... b 可变参数
        int sum = 0;
        for (int i : b){
            sum += i;
//            sum = sum + i;
        }

        sum = sum + a;
        return sum;
    }

}
