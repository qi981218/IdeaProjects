package com.entity;

import com.di.A;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Demo {

    private A a;
    private String name;
    private int age;
    private List<String> list;
    private String[] arr;
    private Map<String, String> map;
    private Properties properties;

    public void setA(A a) {
        this.a = a;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setArr(String[] arr) {
        this.arr = arr;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "Demo{" +
                "a=" + a +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", list=" + list +
                ", arr=" + Arrays.toString(arr) +
                ", map=" + map +
                ", properties=" + properties +
                '}';
    }
}
