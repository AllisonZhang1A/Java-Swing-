package com.zhang.CalMethod;

/**
 * @author ZhangYiAn
 * @version 1.0.0
 * @ClassName Sub.java
 * @Description 基础运算类-减法运算
 * @createTime 2022年11月17日 22:33:00
 */
public class Sub extends Operation {

    @Override
    public double getResult(double numberA, double numberB) {
        return numberA-numberB;
    }
}
