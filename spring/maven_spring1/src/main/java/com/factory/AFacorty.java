package com.factory;

import com.di.A;
import com.di.B;
import org.springframework.beans.factory.FactoryBean;

public class AFacorty implements FactoryBean<A> {
    @Override
    public A getObject() throws Exception {
        return new A(new B());
    }

    @Override
    public Class<?> getObjectType() {
        return A.class;
    }
}
