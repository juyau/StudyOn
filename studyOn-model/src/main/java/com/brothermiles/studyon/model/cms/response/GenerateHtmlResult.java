package com.brothermiles.studyon.model.cms.response;


import com.brothermiles.studyon.common.model.response.ResponseResult;
import com.brothermiles.studyon.common.model.response.ResultCode;
import lombok.Data;


@Data
public class GenerateHtmlResult extends ResponseResult {
    String html;
    public GenerateHtmlResult(ResultCode resultCode, String html) {
        super(resultCode);
        this.html = html;
    }
}
