package com.gupao.pattern.factory.abstractfactory;

/**
 * created by xuyahui on 2019/3/12
 */
public class AbstractFactoryTest {

    public static void main(String[] args) {

        // 生产工厂
        IEquipmentFactory equipmentFactory = new HaierFactory();

        // 使用工厂生产家电产品
        IIcebox icebox = equipmentFactory.createIcebox();
        IWashingMachine washingMachine = equipmentFactory.createWashingMachine();

        // 客户使用家电产品
        icebox.createIceCreem();
        washingMachine.washingClothes();

    }

}
