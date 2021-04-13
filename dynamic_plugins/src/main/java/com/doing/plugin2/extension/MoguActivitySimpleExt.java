package com.doing.plugin2.extension;

import com.alibaba.fastjson.JSONObject;
import com.doing.biz.ActivitySimpleExt;
import com.doing.biz.domain.ExtensionContext;
import com.doing.biz.domain.RequestData;
import com.doing.biz.domain.ResponseData;
import com.doing.container.sdk.CloudBean;
import com.doing.plugin.extension.util.TestUtils;

@CloudBean(key = "moguActivitySimpleExt", description = "蘑菇街简单扩展点")
public class MoguActivitySimpleExt implements ActivitySimpleExt {

    @Override
    public ResponseData simpleProcess(ExtensionContext extensionContext, RequestData requestData) {
        ResponseData responseData = new ResponseData();
        responseData.addData("Mogu.simpleProcess", "蘑菇街活动简单处理流程 19:41");
        responseData.addData("TestUtils.getTestActivity: ", JSONObject.toJSONString(TestUtils.getTestActivity()));
        extensionContext.getLogger().warn("Mogu.simpleProcess - 蘑菇街活动简单处理流程 19:41");
        extensionContext.debug("Mogu", "蘑菇街活动简单处理流程 19:41");
        return responseData;
    }
}
