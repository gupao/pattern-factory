package com.gupao.pattern.factory.abstractfactory;

/**
 * created by xuyahui on 2019/3/12
 */
public class HaierIcebox implements IIcebox{

    @Override
    public void createIceCreem() {
        System.out.println("使用海尔冰箱制作冰激凌，甜");
    }
}
