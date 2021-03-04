package com.brothermiles.studyon.model.cms.response;


import com.brothermiles.studyon.common.model.response.ResponseResult;
import com.brothermiles.studyon.common.model.response.ResultCode;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Data
@ToString
@NoArgsConstructor
public class CoursePreviewResult extends ResponseResult {
    public CoursePreviewResult(ResultCode resultCode, String url) {
        super(resultCode);
        this.url = url;
    }

    String url;
}
