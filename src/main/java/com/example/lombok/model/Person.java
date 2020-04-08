package com.example.lombok.model;

/**
 * @author chenheng
 * @time 2020/4/8 11:16
 */

public class Person {

    private Integer id;

    private String username;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
