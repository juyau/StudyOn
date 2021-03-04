package com.brothermiles.studyon.model.cms.response;

import com.brothermiles.studyon.common.model.response.ResultCode;
import lombok.ToString;


@ToString
public enum CmsCode implements ResultCode {
    CMS_ADDPAGE_EXISTSNAME(false,24001,"Page Name already exist."),
    CMS_GENERATEHTML_DATAURLISNULL(false,24002,"Unable to get data url from the page."),
    CMS_GENERATEHTML_DATAISNULL(false,24003,"Unable to get data from the url."),
    CMS_GENERATEHTML_TEMPLATEISNULL(false,24004,"Template is empty."),
    CMS_GENERATEHTML_HTMLISNULL(false,24005,"Static html is empty."),
    CMS_GENERATEHTML_SAVEHTMLERROR(false,24005,"Error, cannot save html."),
    CMS_COURSE_PERVIEWISNULL(false,24007,"Preview page is empty.");

    boolean success;

    int code;

    String message;
    private CmsCode(boolean success, int code, String message){
        this.success = success;
        this.code = code;
        this.message = message;
    }

    @Override
    public boolean success() {
        return success;
    }

    @Override
    public int code() {
        return code;
    }

    @Override
    public String message() {
        return message;
    }
}
