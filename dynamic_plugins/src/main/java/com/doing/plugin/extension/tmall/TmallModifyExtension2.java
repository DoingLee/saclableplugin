package com.doing.plugin.extension.tmall;

import com.doing.plugin.domain.ExtensionContext;
import com.doing.plugin.domain.RequestData;
import com.doing.plugin.domain.ResponseData;
import com.doing.plugin.extension.ModifyExtension2;

/**
 * @author Doing on 19/12/2018 19:26
 */
public class TmallModifyExtension2 extends ModifyExtension2 {

    @Override
    public void process(ExtensionContext extensionContext, RequestData requestData, ResponseData responseData) {
        responseData.addData("Tmall.modify2", "天猫活动优化处理流程2");
        extensionContext.getLogger().warn("Tmall.modify2 - 天猫活动优化处理流程2");
        extensionContext.debug("Tmall", "天猫活动优化处理流程2");
    }
}
