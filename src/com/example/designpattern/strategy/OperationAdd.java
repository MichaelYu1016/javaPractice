package com.example.designpattern.strategy;

/**
 * 加法操作
 *
 * @author ynx
 * @version V1.0
 * @date 2019-12-31
 * @modified_date 2019-12-31
 */
public class OperationAdd implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
}
