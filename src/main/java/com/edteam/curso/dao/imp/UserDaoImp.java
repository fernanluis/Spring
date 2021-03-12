package com.edteam.curso.dao.imp;

import com.edteam.curso.dao.UserDao;
import com.edteam.curso.models.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class UserDaoImp implements UserDao {


    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List<User> getAll(){

    }

    @Override
    public User get(long id){

    }

    @Override
    public User register(User user){

    }

    @Override
    public User update(User user){

    }

    @Override
    public void delete(long id){

    }

}
