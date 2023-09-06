package com.wxf.Lambda.LambdaTest6;

/**
 * @Author Ssanshu
 * @Date 2023-09-06
 */
public class LambdaDemo {

    public static void main(String[] args) {

        // 匿名内部类
        useInter(new Inter() {
            @Override
            public void show() {
                System.out.println("接口");
            }
        });

        useAnimal(new Animal() {
            @Override
            public void method() {
                System.out.println("抽象类");
            }
        });

        useStudent(new Student(){
            @Override
            public void study() {
                System.out.println("具体类");
            }
        });

        // lambda,只能是接口，且接口中抽象方法只能有一个
        useInter(() -> System.out.println("接口"));
//        useAnimal(() -> System.out.println("抽象类")); // 不能简写
//        useStudent(() -> System.out.println("具体类")); // 不能简写
    }

    private static void useStudent(Student student) {
        student.study();
    }

    private static void useAnimal(Animal animal) {
        animal.method();
    }

    private static void useInter(Inter inter) {
        inter.show();
    }

}
