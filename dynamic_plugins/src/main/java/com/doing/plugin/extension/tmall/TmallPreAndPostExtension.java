package com.doing.plugin.extension.tmall;


import com.doing.plugin.plugin.domain.ExtensionContext;
import com.doing.plugin.plugin.domain.RequestData;
import com.doing.plugin.plugin.domain.ResponseData;
import com.doing.plugin.plugin.extension.PreAndPostExtension;

/**
 * @author Doing on 19/12/2018 15:38
 */
public class TmallPreAndPostExtension implements PreAndPostExtension {

    @Override
    public void beforeProcess(ExtensionContext extensionContext, RequestData requestData, ResponseData responseData) {
        responseData.addData("Tmall.pre", "天猫活动前置处理流程");
        extensionContext.getLogger().warn("Tmall.pre - 天猫活动前置处理流程");
        extensionContext.debug("Tmall", "天猫活动前置处理流程");
    }

    @Override
    public void afterProcess(ExtensionContext extensionContext, RequestData requestData, ResponseData responseData) {
        responseData.addData("Tmall.after", "天猫活动后置处理流程");
        extensionContext.getLogger().warn("Tmall.after - 天猫活动后置处理流程");
        extensionContext.debug("Tmall", "天猫活动后置处理流程");
    }
}
