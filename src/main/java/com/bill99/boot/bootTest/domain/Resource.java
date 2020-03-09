package com.bill99.boot.bootTest.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * 权限表
 */
@Entity(name = "resource")
public class Resource {
    @Id @GeneratedValue
    private int id;
    private String url;
    @Column(name = "res_name")
    private String resName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getResName() {
        return resName;
    }

    public void setResName(String resName) {
        this.resName = resName;
    }
}
