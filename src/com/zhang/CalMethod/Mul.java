package com.zhang.CalMethod;

/**
 * @author ZhangYiAn
 * @version 1.0.0
 * @ClassName Mul.java
 * @Description 基础运算类--乘法运算
 * @createTime 2022年11月17日 22:34:00
 */
public class Mul extends Operation{

    @Override
    public double getResult(double numberA, double numberB) {
        return numberA*numberB;
    }
}
