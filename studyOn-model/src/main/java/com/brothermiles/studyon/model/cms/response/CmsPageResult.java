package com.brothermiles.studyon.model.cms.response;


import com.brothermiles.studyon.common.model.response.ResponseResult;
import com.brothermiles.studyon.common.model.response.ResultCode;
import com.brothermiles.studyon.model.cms.CmsPage;
import lombok.Data;


@Data
public class CmsPageResult extends ResponseResult {
    CmsPage cmsPage;
    public CmsPageResult(ResultCode resultCode, CmsPage cmsPage) {
        super(resultCode);
        this.cmsPage = cmsPage;
    }
}
