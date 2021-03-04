package com.brothermiles.studyon.course.controller;

import com.brothermiles.studyon.api.course.CourseControllerApi;
import com.brothermiles.studyon.course.dao.TeachPlanRepository;
import com.brothermiles.studyon.course.service.CategoryService;
import com.brothermiles.studyon.course.service.CourseService;
import com.brothermiles.studyon.model.course.Category;
import com.brothermiles.studyon.model.course.Teachplan;
import com.brothermiles.studyon.model.course.ext.TeachplanNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/course")
public class CourseController implements CourseControllerApi {

    @Autowired
    CourseService courseService;

    @Autowired
    CategoryService categoryService;


    @Override
    @GetMapping("/teachplanlist/{courseId}")
    public Teachplan findTeachplanNode(@PathVariable String courseId) {
        return courseService.findTeachPlanListNode(courseId);
    }

    @Override
    @GetMapping("/category/list")
    public Category getCategoryList() {
        return categoryService.getCategoryList();
    }

    @GetMapping("/teachplan/{courseId}")
    public List<Teachplan> findTeachplanListOrigin(@PathVariable String courseId) {

        return courseService.findTeachPlanList(courseId);
    }
}
