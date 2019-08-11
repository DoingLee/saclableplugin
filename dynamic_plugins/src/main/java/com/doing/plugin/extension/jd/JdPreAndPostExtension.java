package com.doing.plugin.extension.jd;


import com.doing.plugin.domain.ExtensionContext;
import com.doing.plugin.domain.RequestData;
import com.doing.plugin.domain.ResponseData;
import com.doing.plugin.extension.PreAndPostExtension;

/**
 * @author Doing on 19/12/2018 15:38
 */
public class JdPreAndPostExtension implements PreAndPostExtension {
    @Override
    public void beforeProcess(ExtensionContext extensionContext, RequestData requestData, ResponseData responseData) {
        responseData.addData("Jd.pre", "京东活动前置处理流程");
        extensionContext.getLogger().warn("Jd.pre - 京东活动前置处理流程");
        extensionContext.debug("Jd", "京东活动前置处理流程");
    }

    @Override
    public void afterProcess(ExtensionContext extensionContext, RequestData requestData, ResponseData responseData) {
        responseData.addData("Jd.after", "京东活动后置处理流程");
        extensionContext.getLogger().warn("Jd.after - 京东活动后置处理流程");
        extensionContext.debug("Jd", "京东活动后置处理流程");
    }
}
