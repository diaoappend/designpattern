package com.diao.simpleFactory.order;

import com.diao.simpleFactory.pizzastore.CheesePizza;
import com.diao.simpleFactory.pizzastore.GreekPizza;
import com.diao.simpleFactory.pizzastore.Pizza;

/**
 * @author: Chenzhidiao
 * @date: 2019/12/30 10:36
 * @description:
 * @version: 1.0
 */
public class SimpleFactory {

    public Pizza createPizza(String orderType){
        Pizza pizza=null;
        System.out.println("simpleFactory");
        if (orderType.equals("greek")){
            pizza=new GreekPizza();
            pizza.setName("greekPizza");
        }else if(orderType.equals("cheese")){
            pizza=new CheesePizza();
            pizza.setName("CheesePizza");
        }
        return pizza;
    }
}
