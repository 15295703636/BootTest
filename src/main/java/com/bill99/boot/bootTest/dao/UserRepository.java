package com.bill99.boot.bootTest.dao;

import com.bill99.boot.bootTest.domain.Users;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<Users,String>{

    public List<Users> findByUserName(String userName);
}

