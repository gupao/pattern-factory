package com.gupao.pattern.factory.factorymethod;

import com.gupao.pattern.factory.ICourse;
import com.gupao.pattern.factory.PythonCourse;

/**
 * created by xuyahui on 2019/3/12
 */
public class PythonCourseFctory implements ICourseFactory{
    @Override
    public ICourse create() {
        return new PythonCourse();
    }
}
