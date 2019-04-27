package com.example.microservicesell.service;

import com.example.microservicesell.dao.IDao;
import com.example.microservicesell.service.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

@Repository("autowiredUserServiceImpl")
@Scope("prototype")
public class UserServiceImpl implements IService {

    @Autowired
    private IDao dao;

    @Override
    public String get() {
        return dao.get();
    }
}
