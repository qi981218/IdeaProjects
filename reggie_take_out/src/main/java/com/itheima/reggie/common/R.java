package com.itheima.reggie.common;

import lombok.Data;

@Data
public class R<T> {

    private Integer code;//1.成功   0或其他数字为失败
    private String msg;//错误信息
    private T data;  //数据

    //success:成功
    //static: 静态方法，可以直接通过类名.方法名访问，R.succes()
    //在方法返回值前边添加泛型，代表泛型方法, R.<List>succes(), R.<Employee>succes()
    public static <T> R<T> success(T object){
        R<T> r = new R<>();
        r.data=object;
        r.code=1;
        return r;
    }

    public static <T> R<T> error(String msg) {
        R r = new R();
        r.msg = msg;
        r.code = 0;
        return r;
    }
}
