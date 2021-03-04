package com.brothermiles.studyon.model.course.response;

import lombok.Data;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


@Data
@ToString

public class CategoryListVO {

    @Id
    private String id;
    private String name;
    private String label;
    private String parentid;
    private String isshow;
    private Integer orderby;
    private String isleaf;

    @Transient
    private List<CategoryListVO> SubCategoryList;

}
