package com.doing.plugin2.extension;

import com.doing.biz.ActivityMultiExt;
import com.doing.biz.domain.ExtensionContext;
import com.doing.biz.domain.RequestData;
import com.doing.biz.domain.ResponseData;
import com.doing.container.sdk.CloudBean;

@CloudBean(key = "jdActivityMultiExt", description = "京东复杂扩展点")
public class JdActivityMultiExt implements ActivityMultiExt {

    @Override
    public void processStep1(ExtensionContext extensionContext, RequestData requestData, ResponseData responseData) {
        responseData.addData("Jd.processStep1", "京东活动复杂处理流程step1 19:40");
        extensionContext.getLogger().warn("Jd.processStep1 - 京东活动复杂处理流程step1 19:40");
        extensionContext.debug("Jd", "京东活动复杂处理流程step1 19:40");
    }

    @Override
    public void processStep2(ExtensionContext extensionContext, RequestData requestData, ResponseData responseData) {
        responseData.addData("Jd.processStep2", "京东活动复杂处理流程step2 19:40");
        extensionContext.getLogger().warn("Jd.processStep2 - 京东活动复杂处理流程step2 19:40");
        extensionContext.debug("Jd", "京东活动复杂处理流程step2 19:40");
    }
}
