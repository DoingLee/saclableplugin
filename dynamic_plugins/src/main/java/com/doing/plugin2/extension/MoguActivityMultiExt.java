package com.doing.plugin2.extension;

import com.doing.biz.ActivityMultiExt;
import com.doing.biz.domain.ExtensionContext;
import com.doing.biz.domain.RequestData;
import com.doing.biz.domain.ResponseData;
import com.doing.container.sdk.CloudBean;
import com.doing.plugin.extension.taobao.service.TestService;

import javax.annotation.Resource;

@CloudBean(key = "moguActivityMultiExt", description = "蘑菇街复杂扩展点")
public class MoguActivityMultiExt implements ActivityMultiExt {

    @Override
    public void processStep1(ExtensionContext extensionContext, RequestData requestData, ResponseData responseData) {
        responseData.addData("Mogu.processStep1", "蘑菇街活动复杂处理流程step1 19:41");
        extensionContext.getLogger().warn("Mogu.processStep1 - 蘑菇街活动复杂处理流程step1 19:41");
        extensionContext.debug("Mogu", "蘑菇街活动复杂处理流程step1 19:41");
    }

    @Override
    public void processStep2(ExtensionContext extensionContext, RequestData requestData, ResponseData responseData) {
        responseData.addData("Mogu.processStep2", "蘑菇街活动复杂处理流程step2 19:41");
        extensionContext.getLogger().warn("Mogu.processStep2 - 蘑菇街活动复杂处理流程step2 19:41");
        extensionContext.debug("Mogu", "蘑菇街活动复杂处理流程step2 19:41");
    }
}
