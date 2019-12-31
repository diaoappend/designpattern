package com.diao.cglibproxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author: Chenzhidiao
 * @date: 2019/12/27 10:46
 * @description:
 * @version: 1.0
 */
public class CglibProxyFactory implements MethodInterceptor {
    //维护一个目标对象
    private Object target ;
    //传入一个被代理对象
    public CglibProxyFactory(Object target) {
        this.target = target;
    }
    //返回一个代理对象，是target对象的代理对象
    public Object getProxyInstance(){
        //创建一个工具类
        Enhancer enhancer = new Enhancer();
        //设置父类
        enhancer.setSuperclass(target.getClass());
        //设置回调函数
        enhancer.setCallback(this);
        //创建子类对象，即代理对象
        return enhancer.create();
    }
    //这个方法将实现对目标对象target方法的调用和增强，类似Proxy代理中的invoke方法

    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("开始上课");
        Object returnVal = method.invoke(target, args);
        System.out.println("同学们认真听讲");
        return returnVal;
    }
}
