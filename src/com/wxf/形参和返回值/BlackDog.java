package com.wxf.形参和返回值;

/**
 * @author Ssanhu
 * @Description:
 * @Date 2022-09-03 0:34
 */
public class BlackDog {
    public void eat(Animal g){
        String s = "肉";
        g.eat(s);
    }
    public Animal eat(){
        Animal g = new Dog();
        return g;
    }
}
