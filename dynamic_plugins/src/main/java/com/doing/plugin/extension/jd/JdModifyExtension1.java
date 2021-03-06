package com.doing.plugin.extension.jd;


import com.doing.plugin.domain.ExtensionContext;
import com.doing.plugin.domain.RequestData;
import com.doing.plugin.domain.ResponseData;
import com.doing.plugin.extension.AbstractExtension;
import com.doing.plugin.extension.ModifyExtension1;

/**
 * @author Doing on 19/12/2018 19:26
 */
public class JdModifyExtension1 extends ModifyExtension1 {

    @Override
    public void process(ExtensionContext extensionContext, RequestData requestData, ResponseData responseData) {
        responseData.addData("Jd.modify1", "京东活动优化处理流程1");
        extensionContext.getLogger().warn("Jd.modify1 - 京东活动优化处理流程1");
        extensionContext.debug("Jd", "京东活动优化处理流程1");
    }
}
