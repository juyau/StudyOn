package com.brothermiles.studyon.course.service;

import com.brothermiles.studyon.course.dao.TeachPlanRepository;
import com.brothermiles.studyon.model.course.Teachplan;
import com.brothermiles.studyon.model.course.ext.TeachplanNode;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class CourseService {
    @Autowired
    TeachPlanRepository teachPlanRepository;

    public List<Teachplan> findTeachPlanList(String courseId) {
        return teachPlanRepository.findByCourseid(courseId);
    }

    public Teachplan findTeachPlanListNode(String courseId) {
        List<Teachplan> list = teachPlanRepository.findByCourseid(courseId);

        Teachplan rootNode = new Teachplan();
        if (null != list) {
            rootNode.setChildren(getChildrenDir(list, "0"));
        }
        return rootNode.getChildren().get(0);

    }

    private List<Teachplan> getChildrenDir(List<Teachplan> list, String parentId){
        List<Teachplan> result = new ArrayList<>();
        for(Teachplan teachplan: list){
            System.out.println("parentId from database " +teachplan.getParentid());
            System.out.println("pass in id "+parentId);
            if(null == parentId){
                continue;
            }
            if(parentId.equals(teachplan.getParentid())){
                System.out.println("Equal!!!");
                teachplan.setChildren(getChildrenDir(list, teachplan.getId()));
                result.add(teachplan);
                System.out.println(result);
            }
        }
        return result;
    }

}
