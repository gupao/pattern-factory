package com.gupao.pattern.factory.abstractfactory;

/**
 * created by xuyahui on 2019/3/12
 */
public class HaierWashingMachine implements IWashingMachine{
    @Override
    public void washingClothes() {
        System.out.println("海尔洗衣机，洗衣服放心！");
    }
}
