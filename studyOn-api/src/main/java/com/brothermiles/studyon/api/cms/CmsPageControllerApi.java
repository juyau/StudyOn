package com.brothermiles.studyon.api.cms;

import com.brothermiles.studyon.common.model.response.QueryResponseResult;
import com.brothermiles.studyon.common.model.response.ResponseResult;
import com.brothermiles.studyon.model.cms.CmsPage;
import com.brothermiles.studyon.model.cms.request.QueryPageRequest;
import com.brothermiles.studyon.model.cms.response.CmsPageResult;


public interface CmsPageControllerApi {


    public QueryResponseResult findList(int page, int size, QueryPageRequest queryPageRequest);

    public CmsPageResult add(CmsPage cmsPage);

    public CmsPage findById(String id);

    public CmsPageResult edit(String id, CmsPage cmsPage);

    public ResponseResult deleteById(String id);


}
