package com.zhang.CalMethod;

/**
 * @author ZhangYiAn
 * @version 1.0.0
 * @ClassName Add.java
 * @Description 基础运算方法--add
 * @createTime 2022年11月17日 22:27:00
 */
public class Add extends Operation{

    @Override
    public double getResult(double numberA, double numberB) {
        return numberA+numberB;
    }
}
