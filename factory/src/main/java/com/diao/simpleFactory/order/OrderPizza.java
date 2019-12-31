package com.diao.simpleFactory.order;

import com.diao.simpleFactory.pizzastore.CheesePizza;
import com.diao.simpleFactory.pizzastore.GreekPizza;
import com.diao.simpleFactory.pizzastore.Pizza;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author: Chenzhidiao
 * @date: 2019/12/30 10:12
 * @description:
 * @version: 1.0
 */
public class OrderPizza {
    /*public OrderPizza(){
        Pizza pizza = null;
        String orderType;
        do{
            orderType=getType();
            if (orderType.equals("greek")){
                pizza=new GreekPizza();
                pizza.setName("greekPizza");
            }else if(orderType.equals("cheese")){
                pizza=new CheesePizza();
            }else {
                break;
            }
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }while (true);
    }*/
    SimpleFactory factory = null;
    public void setFactory(SimpleFactory factory){
        String orderType="";
    }


    //获取用户订购的pizza种类
    private String getType(){
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza type");
            String str = strin.readLine();
            return str;
        }catch (Exception e){
            e.printStackTrace();
            return "";
        }
    }
}
