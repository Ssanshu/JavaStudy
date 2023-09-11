package com.wxf.Java高级.动态代理.动态代理的设计模式;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author Ssanshu
 * @Date 2023-09-11
 */
public class ProxyUtil {
    public static Star createProxy(BigStar bigStar) {
        //创建一个代理对象
/*        newProxyInstance(ClassLoader loader,
                Class<?>[] interfaces,
                InvocationHandler h)
                参数1：用于指定一个类加载器
                参数2：指定生成的代理长什么样子，也就是有哪些方法
                参数3：用来指定生成的代理对象要干什么事情
*/
        /*Star starProxy = (Star) Proxy.newProxyInstance(ProxyUtil.class.getClassLoader(),
                new Class[]{Star.class}, new InvocationHandler() {
                    @Override
                    // 回调方法
                    // proxy 代理对象,method 当前调用的方法,args 当前方法传的参数（把方法的参数用Object数组传进来）
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        //代理对象要做的事情，会在这里写代码
                        if (method.getName().equals("sing")) {
                            System.out.println("准备话筒，收钱20万");
                        } else if (method.getName().equals("dance")) {
                            System.out.println("准备场地，收钱100万");
                        }
                        return method.invoke(bigStar, args);
                    }
                });*/

        Star starProxy = (Star) Proxy.newProxyInstance(ProxyUtil.class.getClassLoader(),
                new Class[]{Star.class},
                // 回调方法
                // proxy 代理对象,method 当前调用的方法,args 当前方法传的参数（把方法的参数用Object数组传进来）
                (proxy, method, args) -> {
                    //代理对象要做的事情，会在这里写代码
                    if (method.getName().equals("sing")) {
                        System.out.println("准备话筒，收钱20万");
                    } else if (method.getName().equals("dance")) {
                        System.out.println("准备场地，收钱100万");
                    }
                    return method.invoke(bigStar, args);
                });
        return starProxy;
    }
}
