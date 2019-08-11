package com.doing.plugin.extension.taobao;


import com.doing.plugin.domain.ExtensionContext;
import com.doing.plugin.domain.RequestData;
import com.doing.plugin.domain.ResponseData;
import com.doing.plugin.extension.PreAndPostExtension;

/**
 * @author Doing on 19/12/2018 15:38
 */
public class TaobaoPreAndPostExtension implements PreAndPostExtension {

    @Override
    public void beforeProcess(ExtensionContext extensionContext, RequestData requestData, ResponseData responseData) {
        responseData.addData("Taobao.pre", "淘宝活动前置处理流程");
        extensionContext.getLogger().warn("Taobao.pre - 淘宝活动前置处理流程");
        extensionContext.debug("Taobao", "淘宝活动前置处理流程");
    }

    @Override
    public void afterProcess(ExtensionContext extensionContext, RequestData requestData, ResponseData responseData) {
        responseData.addData("Taobao.after", "淘宝活动后置处理流程");
        extensionContext.getLogger().warn("Taobao.after - 淘宝活动后置处理流程");
        extensionContext.debug("Taobao", "淘宝活动后置处理流程");
    }
}
