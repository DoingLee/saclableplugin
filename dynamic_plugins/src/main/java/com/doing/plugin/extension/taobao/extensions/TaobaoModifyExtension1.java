package com.doing.plugin.extension.taobao.extensions;

import com.doing.plugin.domain.ExtensionContext;
import com.doing.plugin.domain.RequestData;
import com.doing.plugin.domain.ResponseData;
import com.doing.plugin.extension.ModifyExtension1;
import com.doing.plugin.extension.util.TestUtils;
import com.google.gson.Gson;

/**
 * @author Doing on 19/12/2018 19:26
 */
public class TaobaoModifyExtension1 extends ModifyExtension1 {

    @Override
    public void process(ExtensionContext extensionContext, RequestData requestData, ResponseData responseData) {
        responseData.addData("Taobao.modify1", "新淘宝活动优化处理流程1. TestUtils.getTestActivity().getName()=" + TestUtils.getTestActivity().getName());
        extensionContext.getLogger().warn("Taobao.modify1 - 新淘宝活动优化处理流程1. TestUtils.getTestActivity().getName()={}", TestUtils.getTestActivity().getName());
        extensionContext.debug("Taobao", "新淘宝活动优化处理流程1. TestUtils.getTestActivity().getName()={}", TestUtils.getTestActivity().getName());
    }
}
