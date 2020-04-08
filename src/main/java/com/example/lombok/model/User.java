package com.example.lombok.model;

import lombok.SneakyThrows;
import lombok.Value;

import java.io.FileInputStream;
import java.io.InputStream;

/**
 * @author chenheng
 * @time 2020/4/8 11:30
 */
@Value
public class User {

    private Integer id;

    private String username;


    @SneakyThrows
    public void methodThrowException(){
        InputStream inputStream=new FileInputStream("c:/a.txt");
    }
}
