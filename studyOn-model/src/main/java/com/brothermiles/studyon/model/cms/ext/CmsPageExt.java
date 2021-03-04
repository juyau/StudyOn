package com.brothermiles.studyon.model.cms.ext;


import com.brothermiles.studyon.model.cms.CmsPage;
import lombok.Data;
import lombok.ToString;


@Data
@ToString
public class CmsPageExt extends CmsPage {
    private String htmlValue;

}
