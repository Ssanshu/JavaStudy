package com.wxf.接口.方法引用.引用构造器;

/**
 * @Author Ssanshu
 * @Date 2023-09-07
 */
public class StudentDemo {
    public static void main(String[] args) {

        useStudentBuilder((String name,int age) -> {
            return new Student(name,age);
        });

        useStudentBuilder((name,age) -> new Student(name,age));

        // 引用构造器
        // 格式：类名::new
        useStudentBuilder(Student::new);
        // Lambda表达式被构造器替代的时候，它的形式参数全部传递给构造器作为参数
    }

    private static void useStudentBuilder(StudentBuilder sb) {
        Student student = sb.build("张三", 21);
        System.out.println(student.getName() + "," + student.getAge());
    }
}
