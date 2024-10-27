package com.abdtouirsi.metier;

import com.abdtouirsi.dao.IData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MetierImpl implements IMetier {
    @Autowired
    @Qualifier("data")
    private IData datacall;
    @Override
    public double calcul() {
        return Math.random() * datacall.getData();
    }

    /*public MetierImpl(IData datacall) {
        this.datacall = datacall;
    }*/

    public void setDatacall(IData datacall) {
        this.datacall = datacall;
    }
}
