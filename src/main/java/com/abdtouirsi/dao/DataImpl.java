package com.abdtouirsi.dao;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("data")
public class DataImpl implements IData {
    @Override
    public double getData() {
        System.out.println("Recuperation de la base de données");
        return Math.random() * 100;
    }
}
