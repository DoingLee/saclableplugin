package com.doing.plugin.extension.mogu;


import com.doing.plugin.plugin.domain.ExtensionContext;
import com.doing.plugin.plugin.domain.RequestData;
import com.doing.plugin.plugin.domain.ResponseData;
import com.doing.plugin.plugin.extension.PreAndPostExtension;

/**
 * @author Doing on 19/12/2018 15:38
 */
public class MoguPreAndPostExtension implements PreAndPostExtension {
    @Override
    public void beforeProcess(ExtensionContext extensionContext, RequestData requestData, ResponseData responseData) {
        responseData.addData("Mogu.pre", "蘑菇街活动前置处理流程");
        extensionContext.getLogger().warn("Mogu.pre - 蘑菇街活动前置处理流程");
        extensionContext.debug("Mogu", "蘑菇街活动前置处理流程");
    }

    @Override
    public void afterProcess(ExtensionContext extensionContext, RequestData requestData, ResponseData responseData) {
        responseData.addData("Mogu.after", "蘑菇街活动后置处理流程");
        extensionContext.getLogger().warn("Mogu.after - 蘑菇街活动后置处理流程");
        extensionContext.debug("Mogu", "蘑菇街活动后置处理流程");
    }
}
