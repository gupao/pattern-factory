package com.gupao.pattern.factory.simplefactory;

import com.gupao.pattern.factory.ICourse;
import com.gupao.pattern.factory.JavaCourse;
import com.gupao.pattern.factory.PythonCourse;
import com.sun.deploy.util.IcoEncoder;

/**
 * 简单工厂模式
 *
 * created by xuyahui on 2019/3/11
 */
public class CourceFactory {


    public ICourse create1(String courseName){
        if("java".equalsIgnoreCase(courseName)){
            return new JavaCourse();
        }else if("python".equals(courseName)){
            return new PythonCourse();
        }else {
            return null;
        }
    }

    public ICourse create2(String className){
        if(className != null && className != ""){
            try {
                return (ICourse)Class.forName(className).newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return null;
    }


    public ICourse create3(Class<? extends ICourse> clazz){
        try {
            if(clazz != null){
               return  (ICourse) clazz.newInstance();
            }
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }

}
