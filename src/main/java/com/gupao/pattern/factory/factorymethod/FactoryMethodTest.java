package com.gupao.pattern.factory.factorymethod;

import com.gupao.pattern.factory.ICourse;

/**
 * created by xuyahui on 2019/3/12
 */
public class FactoryMethodTest {

    public static void main(String[] args) {

        ICourseFactory factory1 = new JavaCourceFactory();
        ICourse course1 = factory1.create();
        course1.record();

        ICourseFactory factory2 = new PythonCourseFctory();
        ICourse course2 = factory2.create();
        course2.record();

    }

}
