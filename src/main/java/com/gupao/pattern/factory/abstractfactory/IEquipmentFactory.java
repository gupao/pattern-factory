package com.gupao.pattern.factory.abstractfactory;

/**
 * 抽象工厂
 *
 * created by xuyahui on 2019/3/12
 */
public interface IEquipmentFactory {

    IIcebox createIcebox();

    IWashingMachine createWashingMachine();

}
