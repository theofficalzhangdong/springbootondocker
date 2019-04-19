package com.example.mydocker.Service;

import com.example.mydocker.Dao.IDao;
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
