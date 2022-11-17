package com.zhang.Factory.FactoryImpl;

import com.zhang.CalMethod.*;
import com.zhang.Factory.IFactory;

/**
 * @author ZhangYiAn
 * @version 1.0.0
 * @ClassName BaseFactoryImpl.java
 * @Description 基础运算工厂
 * @createTime 2022年11月17日 22:25:00
 */
public class BaseFactoryImpl implements IFactory {

    @Override
    public Operation createOperation(String type) {
        Operation oper=null;
        System.out.println("传进来的符号是"+type);
        switch(type){
            case "+":
                oper=new Add();
                break;
            case "-":
                oper=new Sub();
                break;
            case "*":
                oper=new Mul();
                break;
            case "/":
                oper=new Div();
                break;
        }
        return oper;//返回实例
    }
}
