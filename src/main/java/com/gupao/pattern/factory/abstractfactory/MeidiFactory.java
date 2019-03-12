package com.gupao.pattern.factory.abstractfactory;

/**
 * created by xuyahui on 2019/3/12
 */
public class MeidiFactory implements IEquipmentFactory{
    @Override
    public IIcebox createIcebox() {
        return new MeidiIcebox();
    }

    @Override
    public IWashingMachine createWashingMachine() {
        return new MeidiWashingMachine();
    }
}
