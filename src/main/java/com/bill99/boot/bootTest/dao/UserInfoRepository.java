package com.bill99.boot.bootTest.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.bill99.boot.bootTest.domain.UserInfo;

public interface UserInfoRepository extends CrudRepository<UserInfo, Long> {
    //CrudRepository 增、获取、改、查
    //PagingAndSortingRepository 是CrudRepository子类，增加分页方法

    @Query("select p from user_info p where p.name = ?1")
    public UserInfo getUserByName(String name);
}
