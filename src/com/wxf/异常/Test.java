package com.wxf.异常;

public class Test {
    public static void main(String[] args) {
        System.out.println("开始");
        menthod();
        System.out.println("结束");
    }

    private static void menthod() {
        try{
            int[] a = {1,2,3};
            System.out.println(a[3]);
        }catch (Exception e){
            // 出异常时的代码
//            System.out.println("数组中没有此索引");
            e.printStackTrace(); // 调用这个方法程序会继续执行，会返回异常结果，输出的结果是最全的
//            System.out.println(e.getMessage()); // 返回此throwable 的详细消息字符串
//            System.out.println(e.toString()); // 返回此可抛出的简短描述
        }
    }

}
