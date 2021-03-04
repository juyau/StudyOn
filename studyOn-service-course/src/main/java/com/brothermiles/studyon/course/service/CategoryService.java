package com.brothermiles.studyon.course.service;

import com.brothermiles.studyon.course.dao.CategoryRepository;
import com.brothermiles.studyon.course.dao.TeachPlanRepository;
import com.brothermiles.studyon.model.course.Category;
import com.brothermiles.studyon.model.course.Teachplan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryService {
    @Autowired
    CategoryRepository categoryRepository;

    public Category getCategoryList() {
        Sort sort = Sort.by("orderby");
        List<Category> list = categoryRepository.findAll(sort);

        Category rootCategory = new Category();
        if (null != list) {
            rootCategory.setSubCategoryList(getChildrenDir(list, "0"));
        }
//        return rootCategory;

        return rootCategory.getSubCategoryList().get(0);



    }

    private List<Category> getChildrenDir(List<Category> list, String parentId){
        List<Category> result = new ArrayList<>();
        for(Category category: list){
            if(null == parentId){
                continue;
            }
            if(parentId.equals(category.getParentid())){
                category.setSubCategoryList(getChildrenDir(list, category.getId()));
                result.add(category);
            }
        }
        return result;
    }

}
