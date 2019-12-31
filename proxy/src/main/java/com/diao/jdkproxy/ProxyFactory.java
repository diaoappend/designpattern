package com.diao.jdkproxy;

import com.diao.bean.ITeacher;
import com.diao.bean.Teacher;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author: Chenzhidiao
 * @date: 2019/12/27 10:16
 * @description:
 * @version: 1.0
 */
public class ProxyFactory {
    //维护一个被代理类对象(目标对象)
    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }
    //给被代理类对象生成一个代理对象
    public  Object getProxyInstance(){
        return (ITeacher)Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new InvocationHandler() {
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                Object returnVal = null;
                System.out.println("上课了");
                returnVal = method.invoke(target,args);//目标对象的所有接口方法都会经过该invoke方法，目标对象作为参数传入
                System.out.println("同学们认真听课");
                return returnVal;
            }
        });
    }
}
