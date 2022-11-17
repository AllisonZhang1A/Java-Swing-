package com.zhang.Factory;

import com.zhang.CalMethod.Operation;

/**
 * @author ZhangYiAn
 * @version 1.0.0
 * @ClassName IFactory.java
 * @Description 运算工厂接口
 * @createTime 2022年11月17日 22:23:00
 */
public interface IFactory {
    public Operation createOperation(String type);
}
