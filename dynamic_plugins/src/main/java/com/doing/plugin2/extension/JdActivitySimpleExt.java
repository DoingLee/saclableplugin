package com.doing.plugin2.extension;

import com.doing.biz.ActivitySimpleExt;
import com.doing.biz.domain.ExtensionContext;
import com.doing.biz.domain.RequestData;
import com.doing.biz.domain.ResponseData;
import com.doing.container.sdk.CloudBean;

@CloudBean(key = "jdActivitySimpleExt", description = "京东简单扩展点")
public class JdActivitySimpleExt implements ActivitySimpleExt {

    @Override
    public ResponseData simpleProcess(ExtensionContext extensionContext, RequestData requestData) {
        ResponseData responseData = new ResponseData();
        responseData.addData("Jd.simpleProcess", "京东活动简单处理流程");
        extensionContext.getLogger().warn("Jd.simpleProcess - 京东活动简单处理流程");
        extensionContext.debug("Jd", "京东活动简单处理流程");
        return responseData;
    }
}
