package com.gupao.pattern.factory.simplefactory;

import com.gupao.pattern.factory.ICourse;
import com.gupao.pattern.factory.JavaCourse;

/**
 * created by xuyahui on 2019/3/11
 */
public class SimpleFactoryTest {

    public static void main(String[] args) {

        CourceFactory courceFactory = new CourceFactory();
        ICourse course1 = courceFactory.create1("java");
        course1.record();

        ICourse course2 = courceFactory.create2("com.gupao.pattern.factory.PythonCourse");
        course2.record();

        ICourse course3 = courceFactory.create3(JavaCourse.class);
        course3.record();

    }

}
