package com.gupao.pattern.factory.factorymethod;

import com.gupao.pattern.factory.ICourse;
import com.gupao.pattern.factory.JavaCourse;

/**
 * created by xuyahui on 2019/3/12
 */
public class JavaCourceFactory implements ICourseFactory {

    @Override
    public ICourse create() {
        return new JavaCourse();
    }
}
