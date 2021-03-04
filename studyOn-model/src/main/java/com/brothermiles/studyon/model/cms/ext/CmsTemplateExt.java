package com.brothermiles.studyon.model.cms.ext;

import com.brothermiles.studyon.model.cms.CmsTemplate;
import lombok.Data;
import lombok.ToString;


@Data
@ToString
public class CmsTemplateExt extends CmsTemplate {

    //模版内容
    private String templateValue;

}
