package com.example.mydocker.Dao;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

@Repository("autowiredUserDaoImpl")
@Scope("prototype")
public class IDaoImpl implements IDao{
    @Override
    public String get() {
        return "this is autowired by the resources!";
    }
}
