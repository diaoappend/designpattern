package com.diao.simpleFactory.pizzastore;

/**
 * @author: Chenzhidiao
 * @date: 2019/12/30 10:00
 * @description:
 * @version: 1.0
 */
public abstract class Pizza {
    protected String name;
    public abstract void prepare();

    public void bake(){
        System.out.println(name+"bakding;");
    }
    public void cut(){
        System.out.println(name+"cutting");
    }
    public void box(){
        System.out.println(name+"boxing");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
