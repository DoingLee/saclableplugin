package com.doing.plugin.extension.mogu;


import com.doing.plugin.plugin.domain.ExtensionContext;
import com.doing.plugin.plugin.domain.RequestData;
import com.doing.plugin.plugin.domain.ResponseData;
import com.doing.plugin.plugin.extension.ModifyExtension1;

/**
 * @author Doing on 19/12/2018 19:26
 */
public class MoguModifyExtension1 implements ModifyExtension1 {

    @Override
    public void modify(ExtensionContext extensionContext, RequestData requestData, ResponseData responseData) {
        responseData.addData("Mogu.modify1", "蘑菇街活动优化处理流程1");
        extensionContext.getLogger().warn("Mogu.modify1 - 蘑菇街活动优化处理流程1");
        extensionContext.debug("Mogu", "蘑菇街活动优化处理流程1");

    }
}
