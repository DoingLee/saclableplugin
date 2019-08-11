package com.doing.plugin.extension.tmall;


import com.doing.plugin.domain.ExtensionContext;
import com.doing.plugin.domain.RequestData;
import com.doing.plugin.domain.ResponseData;
import com.doing.plugin.extension.ModifyExtension1;

/**
 * @author Doing on 19/12/2018 19:26
 */
public class TmallModifyExtension1 implements ModifyExtension1 {

    @Override
    public void modify(ExtensionContext extensionContext, RequestData requestData, ResponseData responseData) {
        responseData.addData("Tmall.modify1", "天猫活动优化处理流程1");
        extensionContext.getLogger().warn("Tmall.modify1 - 天猫活动优化处理流程1");
        extensionContext.debug("Tmall", "天猫活动优化处理流程1");

    }
}
