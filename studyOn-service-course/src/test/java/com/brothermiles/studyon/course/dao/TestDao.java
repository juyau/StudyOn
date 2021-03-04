package com.brothermiles.studyon.course.dao;

import com.brothermiles.studyon.model.course.CourseBasic;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Optional;

/**
 * @author Administrator
 * @version 1.0
 **/
@SpringBootTest
@RunWith(SpringRunner.class)
public class TestDao {
    @Autowired
    CourseBasicRepository courseBasicRepository;


    @Test
    public void testCourseBaseRepository(){
        Optional<CourseBasic> optional = courseBasicRepository.findById("402885816243d2dd016243f24c030002");
        if(optional.isPresent()){
            CourseBasic courseBase = optional.get();
            System.out.println(courseBase);
        }

    }

}
