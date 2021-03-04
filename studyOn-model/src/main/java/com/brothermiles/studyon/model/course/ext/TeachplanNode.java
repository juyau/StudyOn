package com.brothermiles.studyon.model.course.ext;

import com.brothermiles.studyon.model.course.Teachplan;
import lombok.Data;
import lombok.ToString;

import java.util.List;


@Data
@ToString
public class TeachplanNode extends Teachplan {

    List<Teachplan> children;

//    //媒资文件id
//    String mediaId;
//    //媒资文件原始名称
//    String mediaFileoriginalname;


}
