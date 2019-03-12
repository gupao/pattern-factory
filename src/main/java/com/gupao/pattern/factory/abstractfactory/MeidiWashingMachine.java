package com.gupao.pattern.factory.abstractfactory;

/**
 * created by xuyahui on 2019/3/12
 */
public class MeidiWashingMachine implements IWashingMachine{
    @Override
    public void washingClothes() {
        System.out.println("美的洗衣机洗衣服，干干净净！");
    }
}
