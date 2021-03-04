package com.brothermiles.studyon.api.course;
import com.brothermiles.studyon.model.course.Category;
import com.brothermiles.studyon.model.course.Teachplan;
import com.brothermiles.studyon.model.course.ext.TeachplanNode;

public interface CourseControllerApi {
    public Teachplan findTeachplanNode(String courseId);
    public Category getCategoryList();
}
