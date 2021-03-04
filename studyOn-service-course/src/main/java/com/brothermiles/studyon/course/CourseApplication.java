package com.brothermiles.studyon.course;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EntityScan("com.brothermiles.studyon.model.course")//扫描实体类
@ComponentScan(basePackages={"com.brothermiles.studyon.api"})//扫描接口
@ComponentScan(basePackages={"com.brothermiles.studyon.course"})
@ComponentScan(basePackages={"com.brothermiles.studyon.model"})
@ComponentScan(basePackages={"com.brothermiles.studyon.common"})//扫描common下的所有类
public class CourseApplication {
    public static void main(String[] args) throws Exception{
         SpringApplication.run(CourseApplication.class, args);
    }
}
