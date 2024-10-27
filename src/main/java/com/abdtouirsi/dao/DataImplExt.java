package com.abdtouirsi.dao;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("data2")
public class DataImplExt implements IData {
    @Override
    @Qualifier("data2")
    public double getData() {
        return 0;
    }
}
