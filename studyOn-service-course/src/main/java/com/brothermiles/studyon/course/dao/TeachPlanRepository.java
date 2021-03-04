package com.brothermiles.studyon.course.dao;


import com.brothermiles.studyon.model.course.Teachplan;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface TeachPlanRepository extends JpaRepository<Teachplan,String> {
    List<Teachplan> findByCourseid(String courseId);
}
