package com.doing.plugin.extension.jd;


import com.doing.plugin.domain.ExtensionContext;
import com.doing.plugin.domain.RequestData;
import com.doing.plugin.domain.ResponseData;
import com.doing.plugin.extension.ModifyExtension2;

/**
 * @author Doing on 19/12/2018 19:26
 */
public class JdModifyExtension2 implements ModifyExtension2 {

    @Override
    public void modify(ExtensionContext extensionContext, RequestData requestData, ResponseData responseData) {
        responseData.addData("Jd.modify2", "京东活动优化处理流程2");
        extensionContext.getLogger().warn("Jd.modify2 - 京东活动优化处理流程2");
        extensionContext.debug("Jd", "京东活动优化处理流程2");
    }
}
