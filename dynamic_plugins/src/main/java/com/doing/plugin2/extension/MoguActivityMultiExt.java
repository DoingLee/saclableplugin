package com.doing.plugin2.extension;

import com.doing.biz.ActivityMultiExt;
import com.doing.biz.domain.ExtensionContext;
import com.doing.biz.domain.RequestData;
import com.doing.biz.domain.ResponseData;
import com.doing.container.sdk.CloudBean;

@CloudBean(key = "moguActivityMultiExt", description = "蘑菇街复杂扩展点")
public class MoguActivityMultiExt implements ActivityMultiExt {

    @Override
    public void processStep1(ExtensionContext extensionContext, RequestData requestData, ResponseData responseData) {
        responseData.addData("Mogu.processStep1", "蘑菇街活动复杂处理流程step1");
        extensionContext.getLogger().warn("Mogu.processStep1 - 蘑菇街活动复杂处理流程step1");
        extensionContext.debug("Mogu", "蘑菇街活动复杂处理流程step1");
    }

    @Override
    public void processStep2(ExtensionContext extensionContext, RequestData requestData, ResponseData responseData) {
        responseData.addData("Mogu.processStep2", "蘑菇街活动复杂处理流程step2");
        extensionContext.getLogger().warn("Mogu.processStep2 - 蘑菇街活动复杂处理流程step2");
        extensionContext.debug("Mogu", "蘑菇街活动复杂处理流程step2");
    }
}
