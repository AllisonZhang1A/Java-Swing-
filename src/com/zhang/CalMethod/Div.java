package com.zhang.CalMethod;

/**
 * @author ZhangYiAn
 * @version 1.0.0
 * @ClassName Div.java
 * @Description 基础运算类-除法运算
 * @createTime 2022年11月17日 22:35:00
 */
public class Div extends Operation{

    @Override
    public double getResult(double numberA, double numberB) {
        System.out.println("A/B="+numberA+"/"+numberB);
        return numberA/numberB;
    }
}
