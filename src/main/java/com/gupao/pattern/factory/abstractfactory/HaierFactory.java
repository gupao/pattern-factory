package com.gupao.pattern.factory.abstractfactory;

/**
 * created by xuyahui on 2019/3/12
 */
public class HaierFactory implements IEquipmentFactory {
    @Override
    public IIcebox createIcebox() {
        return new HaierIcebox();
    }

    @Override
    public IWashingMachine createWashingMachine() {
        return new HaierWashingMachine();
    }
}
