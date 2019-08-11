package com.doing.plugin.extension.mogu;


import com.doing.plugin.domain.ExtensionContext;
import com.doing.plugin.domain.RequestData;
import com.doing.plugin.domain.ResponseData;
import com.doing.plugin.extension.ModifyExtension2;

/**
 * @author Doing on 19/12/2018 19:26
 */
public class MoguModifyExtension2 implements ModifyExtension2 {

    @Override
    public void modify(ExtensionContext extensionContext, RequestData requestData, ResponseData responseData) {
        responseData.addData("Mogu.modify2", "蘑菇街活动优化处理流程2");
        extensionContext.getLogger().warn("Mogu.modify2 - 蘑菇街活动优化处理流程2");
        extensionContext.debug("Mogu", "蘑菇街活动优化处理流程2");
    }
}
