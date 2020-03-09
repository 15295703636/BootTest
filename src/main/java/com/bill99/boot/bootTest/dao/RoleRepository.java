package com.bill99.boot.bootTest.dao;

import com.bill99.boot.bootTest.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface RoleRepository extends JpaRepository<Role,Integer>,JpaSpecificationExecutor<Role> {
    //nativeQuery自定义sql语句并且开启本地sql,
    //根据用户名查找该用户所有权限
    @Query(value = "select r.* from role r, user_role ur where ur.user_name = ?1 and ur.rid = r.id", nativeQuery = true)
    public List<Role> findRolesOfUser(String username);

    //根据resource的主键查找resource允许的所有权限
    @Query(value = "select r.* from role r, resource_role rr where rr.res_id = ?1 and rr.rid = r.id", nativeQuery = true)
    public List<Role> findRolesOfResource(long resourceId);

}
