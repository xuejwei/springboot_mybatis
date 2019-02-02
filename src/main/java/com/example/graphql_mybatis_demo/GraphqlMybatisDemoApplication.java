package com.example.graphql_mybatis_demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication()
@MapperScan("com.example.graphql_mybatis_demo.dao")
public class GraphqlMybatisDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(GraphqlMybatisDemoApplication.class, args);
    }
}

